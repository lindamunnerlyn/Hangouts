// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ecr
    implements gdx
{

    public static final boolean b = false;
    private static final gdw e;
    public final Resources a;
    public final String c;
    public he d;

    protected ecr(String s)
    {
        a = g.nU.getResources();
        c = s;
        if (b)
        {
            d = new he(30);
        }
    }

    public static android.graphics.BitmapFactory.Options a(boolean flag, int i, int j)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = flag;
        options.inDensity = i;
        options.inTargetDensity = j;
        options.inSampleSize = 1;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        return options;
    }

    public static ecr a(Context context, int i, int j, int k, int l, String s)
    {
        if (g.a(context, "babel_enable_bitmap_pool", true))
        {
            context = new ect(i, j, k, l, s);
        } else
        {
            context = new ecr(s);
        }
        e.a(context);
        return context;
    }

    public static boolean a(Context context)
    {
        return g.a(context, "babel_enable_bitmap_pool", true);
    }

    public Bitmap a(int i, int j, ecs ecs1)
    {
        if (ecs1 != null)
        {
            ecs1 = ecs1.a(i, j);
            if (ecs1 != null)
            {
                ecs1.eraseColor(0);
                return ecs1;
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
            eev.f("Babel", (new StringBuilder(37)).append("Decoding resource ").append(i).append(" failed.").toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.BitmapFactory.Options options)
        {
            eev.f("Babel", (new StringBuilder(33)).append("Oom decoding resource ").append(i).toString());
            e.a();
            return null;
        }
        return options;
    }

    public Bitmap a(byte abyte0[], android.graphics.BitmapFactory.Options options, int i, int j, ecs ecs1)
    {
        try
        {
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            eev.f("Babel", "Decoding byte array failed.");
            return null;
        }
        return abyte0;
    }

    public void a()
    {
    }

    public void a(Bitmap bitmap)
    {
        gdv.b("Expected condition to be false", aon.a(bitmap));
        if (bitmap != null)
        {
            c(bitmap);
            return;
        } else
        {
            eev.d("Babel", "BitmapPool receiving null bitmap", new Exception());
            return;
        }
    }

    public boolean a(int i, int j)
    {
        return true;
    }

    public void b(int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (i != 5)
            {
                a();
            }
            return;
        } else
        {
            a();
            return;
        }
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
        e = gdw.a;
        hnc hnc = eev.u;
    }
}
