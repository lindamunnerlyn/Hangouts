// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

final class fpz extends AsyncTask
{

    final fpy a;
    final ParcelFileDescriptor b;
    final int c;
    final int d;
    final int e;
    final fpx f;

    fpz(fpx fpx1, fpy fpy1, ParcelFileDescriptor parcelfiledescriptor, int i, int j, int k)
    {
        f = fpx1;
        super();
        a = fpy1;
        b = parcelfiledescriptor;
        c = i;
        d = j;
        e = k;
    }

    private transient Bitmap a()
    {
        if (!fpx.a(f)) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = g.a(b);
        if (bitmap != null) goto _L4; else goto _L3
_L3:
        bitmap = null;
_L6:
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        fpx.d(f).put(a.g, bitmap);
        if (b != null)
        {
            try
            {
                b.close();
            }
            catch (IOException ioexception)
            {
                ioexception.getMessage();
                return bitmap;
            }
        }
        return bitmap;
_L4:
        bitmap = g.b(bitmap);
        continue; /* Loop/switch isn't completed */
_L2:
        bitmap = fpx.a(b, c, d, e, (int)(((float)c * fpx.b(f)) / fpx.c(f)));
        if (bitmap == null)
        {
            bitmap = null;
            continue; /* Loop/switch isn't completed */
        }
        bitmap = fpx.a(bitmap, c, fpx.b(f) / fpx.c(f));
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        if (b != null)
        {
            try
            {
                b.close();
            }
            catch (IOException ioexception1)
            {
                ioexception1.getMessage();
            }
        }
        throw exception;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (a.f.getTag() == a)
        {
            f.a(a, ((Bitmap) (obj)));
        }
    }
}
