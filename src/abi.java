// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

public final class abi extends ea
    implements abj
{

    private String f;
    private Bitmap g;

    public abi(Context context, String s)
    {
        super(context);
        f = s;
    }

    private void a(abk abk1)
    {
        Bitmap bitmap;
        if (abk1 != null)
        {
            bitmap = abk1.b;
        } else
        {
            bitmap = null;
        }
        if (r())
        {
            if (bitmap != null)
            {
                a(bitmap);
            }
        } else
        {
            Bitmap bitmap1 = g;
            g = bitmap;
            if (p())
            {
                super.b(abk1);
            }
            if (bitmap1 != null && bitmap1 != bitmap && !bitmap1.isRecycled())
            {
                a(bitmap1);
                return;
            }
        }
    }

    private static void a(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    private abk h()
    {
        abk abk1 = new abk();
        Object obj1 = n();
        Object obj = abk1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = abk1;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = ((Context) (obj1)).getContentResolver();
        try
        {
            obj1 = abn.a(((android.content.ContentResolver) (obj)), Uri.parse(f), aao.b);
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            abk1.c = 1;
            return abk1;
        }
        obj = obj1;
        abk1 = ((abk) (obj1));
        if (((abk) (obj1)).b == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        abk1 = ((abk) (obj1));
        ((abk) (obj1)).b.setDensity(160);
        obj = obj1;
        return ((abk) (obj));
    }

    public void a(Object obj)
    {
        obj = (abk)obj;
        super.a(obj);
        if (obj != null)
        {
            a(((abk) (obj)).b);
        }
    }

    public void a(String s)
    {
        f = s;
    }

    public void b(Object obj)
    {
        a((abk)obj);
    }

    public Object d()
    {
        return h();
    }

    protected void i()
    {
        if (g != null)
        {
            abk abk1 = new abk();
            abk1.c = 0;
            abk1.b = g;
            a(abk1);
        }
        if (y() || g == null)
        {
            u();
        }
    }

    protected void j()
    {
        t();
    }

    protected void k()
    {
        super.k();
        j();
        if (g != null)
        {
            a(g);
            g = null;
        }
    }
}
