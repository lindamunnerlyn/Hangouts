// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;

public final class dpy
{

    private static final Typeface a = Typeface.create("sans-serif-light", 0);

    public dpy()
    {
    }

    public static boolean a(Context context, Bitmap bitmap, String s, float f, int i, int j)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k;
        int l;
        s = s.toCharArray();
        l = s.length;
        k = 0;
_L9:
        if (k >= l) goto _L4; else goto _L3
_L3:
        char c = s[k];
        if (!Character.isLetter(c)) goto _L6; else goto _L5
_L5:
        s = Character.toString(Character.toUpperCase(c));
_L10:
        if (s == null) goto _L1; else goto _L7
_L7:
        Paint paint;
        RectF rectf;
        bitmap = new Canvas(bitmap);
        bitmap.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(context.getResources().getColor(j));
        rectf = new RectF(0.0F, 0.0F, f + 0.0F, f + 0.0F);
        switch (dpz.a[i - 1])
        {
        default:
            bitmap.drawOval(rectf, paint);
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_277;
        }
_L11:
        paint = new Paint();
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setColor(context.getResources().getColor(0x106000b));
        paint.setTypeface(a);
        paint.setTextSize(0.6F * f);
        paint.setAntiAlias(true);
        context = new Rect();
        paint.getTextBounds(s, 0, 1, context);
        bitmap.drawText(s, f / 2.0F + 0.0F, (((float)((Rect) (context)).bottom + f) - (float)((Rect) (context)).top) / 2.0F + 0.0F, paint);
        return true;
_L6:
        if (Character.isDigit(c)) goto _L4; else goto _L8
_L8:
        k++;
          goto _L9
_L4:
        s = null;
          goto _L10
        bitmap.drawRect(rectf, paint);
          goto _L11
    }

}
