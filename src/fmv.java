// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;

public final class fmv extends fnb
{

    public fmv(Context context, ejx ejx)
    {
        super(context, ejx, true);
    }

    public static Bitmap a(Context context)
    {
        return g.b(BitmapFactory.decodeResource(context.getResources(), g.rz));
    }

    static void a(fmv fmv1, Status status, ParcelFileDescriptor parcelfiledescriptor, fnc fnc1)
    {
        fmv1.fnb.a(status, parcelfiledescriptor, fnc1, 0);
    }

    public void a(ImageView imageview, fqu fqu, int i)
    {
        a(((fnc) (new fmw(this, imageview, fqu, i))));
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
