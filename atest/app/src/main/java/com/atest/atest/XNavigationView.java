package com.atest.atest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class XNavigationView extends View {
    public XNavigationView(Context context) {
        super(context);
        initPaint(context);
    }
    public XNavigationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint(context);
    }
    private Paint mPaint;
    private static final int[] SECTION_COLORS = new int[2]; // 分段颜色
    private float cca[] = {0.01f, 0.27f, 0.53f, 0.8f},ccb[] = {0.2f, 0.47f, 0.73f, 0.99f};
    private float ccLeft, ccRight;
    private int pageSelected = 0;
    void initNum(int cnt) {
        if(cnt == 3) {
            cca[1] = 0.35f;cca[2] = 0.7f;
            ccb[0] = 0.3f;ccb[1] = 0.65f;ccb[2] = 0.99f;
        }
    }
    private void initPaint(Context context) {
        mPaint = new Paint();
        mPaint.setAntiAlias(true); // 设置抗锯齿
        mPaint.setStyle(Paint.Style.FILL); // 设置填充样式
        mPaint.setDither(true); // 设定是否使用图像抖动处理，会使绘制出来的图片颜色更加平滑和饱满，图像更加清晰
        mPaint.setFilterBitmap(true); // 加快显示速度，本设置项依赖于dither和xfermode的设置
        SECTION_COLORS[0] = 0xff0077ff;
        SECTION_COLORS[1] = 0xff77dd77;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int mWidth = getWidth();
        int mHeight = getHeight();
        int layerId = canvas.saveLayer(0, 0, mWidth, mHeight, null, Canvas.ALL_SAVE_FLAG);
        // 绘制两端是半圆的矩形
        RectF rectBlackBg;
        rectBlackBg = new RectF(mWidth * ccLeft, 0, mWidth * ccRight, mHeight);
        canvas.drawRoundRect(rectBlackBg, mHeight / 2, mHeight / 2, mPaint);
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        // 绘制渐变色
        int count = 2;
        int[] colors = new int[count];
        System.arraycopy(SECTION_COLORS, 0, colors, 0, count);
        LinearGradient shader = new LinearGradient(0, mHeight / 2, mWidth, mHeight / 2, colors, null, Shader.TileMode.MIRROR);
        mPaint.setShader(shader);
        RectF rectProgressBg = new RectF(0, 0, mWidth, mHeight);
        canvas.drawRoundRect(rectProgressBg, 0, 0, mPaint);
        // 最后将画笔去除Xfermode
        mPaint.setXfermode(null);
        canvas.restoreToCount(layerId);
    }
    public void setCurrentCount(float currentCount,int id) {
        if (currentCount == 0) {
            ccLeft = cca[id];
            ccRight = ccb[id];
        } else if (currentCount < 0.5) {
            ccLeft = cca[id];
            ccRight = ccb[id] + (ccb[id + 1] - ccb[id]) * 2 * currentCount;
        } else {
            ccLeft = cca[id] + (cca[id + 1] - cca[id]) * 2 * (currentCount - 0.5f);
            ccRight = ccb[id + 1];
        }
        invalidate();
    }
    public void setPageSelected(int pageSelected) {
        this.pageSelected = pageSelected;
    }
}