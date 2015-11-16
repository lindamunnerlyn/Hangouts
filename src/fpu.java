// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

public final class fpu extends fpx
{

    private Bitmap d;

    public fpu(Context context, emy emy)
    {
        super(context, emy, false);
    }

    public Bitmap a(Context context)
    {
        if (d == null)
        {
            d = BitmapFactory.decodeResource(context.getResources(), g.rA);
        }
        return d;
    }

    public void a(ImageView imageview, ftl ftl1, int i)
    {
        if (!g.a(ftl1))
        {
            return;
        } else
        {
            a(((fpy) (new fpv(this, imageview, ftl1.a(), ftl1.d(), i))));
            return;
        }
    }

    protected void a(fpy fpy1, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            fpy1.f.setImageBitmap(a(b));
            return;
        } else
        {
            super.a(fpy1, bitmap);
            return;
        }
    }
}
