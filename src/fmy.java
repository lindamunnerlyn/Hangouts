// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

public final class fmy extends fnb
{

    private Bitmap d;

    public fmy(Context context, ejx ejx)
    {
        super(context, ejx, false);
    }

    public Bitmap a(Context context)
    {
        if (d == null)
        {
            d = BitmapFactory.decodeResource(context.getResources(), g.ry);
        }
        return d;
    }

    public void a(ImageView imageview, fqu fqu1, int i)
    {
        a(((fnc) (new fmz(this, imageview, fqu1.a(), fqu1.d(), i))));
    }

    protected void a(fnc fnc1, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            fnc1.f.setImageBitmap(a(b));
            return;
        } else
        {
            super.a(fnc1, bitmap);
            return;
        }
    }
}
