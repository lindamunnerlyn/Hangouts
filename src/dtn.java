// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;

public final class dtn extends PictureDrawable
{

    private final float a;

    public dtn(Picture picture, float f)
    {
        super(picture);
        a = f;
    }

    public void draw(Canvas canvas)
    {
        canvas.save();
        canvas.scale(a, a);
        canvas.drawPicture(getPicture());
        canvas.restore();
    }

    public int getIntrinsicHeight()
    {
        return (int)((float)super.getIntrinsicHeight() * a);
    }

    public int getIntrinsicWidth()
    {
        return (int)((float)super.getIntrinsicWidth() * a);
    }
}
