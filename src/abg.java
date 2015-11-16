// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

public final class abg extends ea
    implements abh
{

    private String f;
    private Bitmap g;

    public abg(Context context, String s)
    {
        super(context);
        f = s;
    }

    private void a(abi abi1)
    {
        Bitmap bitmap;
        if (abi1 != null)
        {
            bitmap = abi1.b;
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
                super.b(abi1);
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

    private abi h()
    {
        abi abi1 = new abi();
        Object obj1 = n();
        Object obj = abi1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = abi1;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = ((Context) (obj1)).getContentResolver();
        try
        {
            obj1 = abl.a(((android.content.ContentResolver) (obj)), Uri.parse(f), aam.b);
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            abi1.c = 1;
            return abi1;
        }
        obj = obj1;
        abi1 = ((abi) (obj1));
        if (((abi) (obj1)).b == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        abi1 = ((abi) (obj1));
        ((abi) (obj1)).b.setDensity(160);
        obj = obj1;
        return ((abi) (obj));
    }

    public void a(Object obj)
    {
        obj = (abi)obj;
        super.a(obj);
        if (obj != null)
        {
            a(((abi) (obj)).b);
        }
    }

    public void a(String s)
    {
        f = s;
    }

    public void b(Object obj)
    {
        a((abi)obj);
    }

    public Object d()
    {
        return h();
    }

    protected void i()
    {
        if (g != null)
        {
            abi abi1 = new abi();
            abi1.c = 0;
            abi1.b = g;
            a(abi1);
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
