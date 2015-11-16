// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;

public final class fpr extends fpx
{

    public fpr(Context context, emy emy)
    {
        super(context, emy, true);
    }

    public static Bitmap a(Context context)
    {
        return g.b(BitmapFactory.decodeResource(context.getResources(), g.rB));
    }

    static void a(fpr fpr1, Status status, ParcelFileDescriptor parcelfiledescriptor, fpy fpy1)
    {
        fpr1.fpx.a(status, parcelfiledescriptor, fpy1, 0);
    }

    public void a(ImageView imageview, ftl ftl, int i)
    {
        a(((fpy) (new fps(this, imageview, ftl, i))));
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
