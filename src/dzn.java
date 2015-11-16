// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class dzn
    implements gbj
{

    public static final boolean b = false;
    private static final gbi e;
    public final Resources a;
    public final String c;
    public he d;

    protected dzn(String s)
    {
        a = g.nS.getResources();
        c = s;
        if (b)
        {
            d = new he(30);
        }
    }

    public static android.graphics.BitmapFactory.Options a(boolean flag, int i, int j)
    {
        return dzp.b(flag, i, j);
    }

    public static dzn a(int i, int j, int k, int l, String s)
    {
        s = new dzp(i, j, k, l, s);
        e.a(s);
        return s;
    }

    public Bitmap a(int i, int j, dzo dzo1)
    {
        if (dzo1 != null)
        {
            dzo1 = dzo1.a(i, j);
            if (dzo1 != null)
            {
                dzo1.eraseColor(0);
                return dzo1;
            }
        }
        return Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public Bitmap a(int i, android.graphics.BitmapFactory.Options options, int j, int k)
    {
        try
        {
            options = BitmapFactory.decodeResource(a, i, options);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.BitmapFactory.Options options)
        {
            ebw.f("Babel", (new StringBuilder(37)).append("Decoding resource ").append(i).append(" failed.").toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.BitmapFactory.Options options)
        {
            ebw.f("Babel", (new StringBuilder(33)).append("Oom decoding resource ").append(i).toString());
            e.a();
            return null;
        }
        return options;
    }

    public Bitmap a(byte abyte0[], android.graphics.BitmapFactory.Options options, int i, int j, dzo dzo1)
    {
        try
        {
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ebw.f("Babel", "Decoding byte array failed.");
            return null;
        }
        return abyte0;
    }

    public void a()
    {
    }

    public void a(Bitmap bitmap)
    {
        gbh.b(anv.a(bitmap));
        if (bitmap != null)
        {
            c(bitmap);
            return;
        } else
        {
            ebw.d("Babel", "BitmapPool receiving null bitmap", new Exception());
            return;
        }
    }

    public boolean a(int i, int j)
    {
        return true;
    }

    public void b(int i)
    {
    }

    boolean b(Bitmap bitmap)
    {
        return false;
    }

    protected final void c(Bitmap bitmap)
    {
        bitmap.recycle();
        if (b)
        {
            d.a(bitmap, new Exception());
        }
    }

    public void h()
    {
        a();
    }

    static 
    {
        e = gbi.a;
        hik hik = ebw.u;
    }
}
