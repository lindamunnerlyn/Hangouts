// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class fpx
{

    public static volatile Executor a = null;
    private static boolean k;
    public final Context b;
    public final emy c;
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    private boolean e;
    private fpy f;
    private final LinkedList g = new LinkedList();
    private boolean h;
    private float i;
    private float j;

    public fpx(Context context, emy emy1, boolean flag)
    {
        b = context;
        c = emy1;
        h = flag;
        emy1 = context.getResources();
        j = emy1.getInteger(g.sc);
        i = emy1.getInteger(g.sb);
        context = (ActivityManager)context.getSystemService("activity");
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = context.isLowRamDevice();
        } else
        {
            flag = false;
        }
        k = flag;
    }

    private static int a(int l, int i1, int j1, int k1)
    {
        if (!k) goto _L2; else goto _L1
_L1:
        int l1 = 2;
_L4:
        return l1;
_L2:
        boolean flag;
        flag = true;
        l1 = 1;
        if (l <= k1 && i1 <= j1) goto _L4; else goto _L3
_L3:
        int i2;
        i2 = l / 2;
        i1 /= 2;
        l = ((flag) ? 1 : 0);
_L7:
        l1 = l;
        if (i2 / l < k1) goto _L4; else goto _L5
_L5:
        l1 = l;
        if (i1 / l < j1) goto _L4; else goto _L6
_L6:
        l <<= 1;
          goto _L7
    }

    public static Bitmap a(Bitmap bitmap, int l, float f1)
    {
        int k1 = (int)((float)l * f1);
        int i1 = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        if (l == i1 && k1 == j1)
        {
            return bitmap;
        } else
        {
            Matrix matrix = new Matrix();
            f1 = Math.max((float)l / (float)i1, (float)k1 / (float)j1);
            matrix.setScale(f1, f1);
            l = Math.round((float)l / f1);
            k1 = Math.round((float)k1 / f1);
            int l1 = (int)((float)i1 * 0.5F - (float)(l / 2));
            int i2 = (int)((float)j1 * 0.5F - (float)(k1 / 2));
            return Bitmap.createBitmap(bitmap, Math.max(Math.min(l1, i1 - l), 0), Math.max(Math.min(i2, j1 - k1), 0), l, k1, matrix, true);
        }
    }

    public static Bitmap a(ParcelFileDescriptor parcelfiledescriptor, int l, int i1, int j1, int k1)
    {
        android.graphics.BitmapFactory.Options options;
        if (parcelfiledescriptor == null)
        {
            return null;
        }
        options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = a(l, i1, j1, k1);
        options.inJustDecodeBounds = false;
        options.outWidth = l;
        options.outHeight = i1;
        if (k)
        {
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        Object obj = new FileInputStream(parcelfiledescriptor.getFileDescriptor());
        parcelfiledescriptor = BitmapFactory.decodeStream(((InputStream) (obj)), null, options);
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return parcelfiledescriptor;
        }
        return parcelfiledescriptor;
        parcelfiledescriptor;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception) { }
        }
        throw parcelfiledescriptor;
        parcelfiledescriptor;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a()
    {
        while (g.isEmpty() || f != null && !f.e) 
        {
            return;
        }
        f = (fpy)g.remove();
        f.a();
    }

    static boolean a(fpx fpx1)
    {
        return fpx1.h;
    }

    static float b(fpx fpx1)
    {
        return fpx1.i;
    }

    static float c(fpx fpx1)
    {
        return fpx1.j;
    }

    static ConcurrentHashMap d(fpx fpx1)
    {
        return fpx1.d;
    }

    public void a(ImageView imageview)
    {
        imageview.setTag(null);
        for (int l = 0; l < g.size();)
        {
            if (((fpy)g.get(l)).f == imageview)
            {
                g.remove(l);
            } else
            {
                l++;
            }
        }

        if (f != null && f.f == imageview)
        {
            f.e = true;
            a();
        }
    }

    public void a(Status status, ParcelFileDescriptor parcelfiledescriptor, int l, int i1, int j1, fpy fpy1)
    {
        fpy fpy2 = f;
        if (fpy2 == fpy1) goto _L2; else goto _L1
_L1:
        if (!e)
        {
            a();
        }
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        parcelfiledescriptor.close();
_L4:
        return;
_L2:
        boolean flag;
        f = null;
        flag = e;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (!e)
        {
            a();
        }
        if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
        try
        {
            parcelfiledescriptor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            return;
        }
        if (fpy1.f.getTag() != fpy1)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        flag = fpy1.e;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (!e)
        {
            a();
        }
        if (parcelfiledescriptor == null) goto _L4; else goto _L5
_L5:
        try
        {
            parcelfiledescriptor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            return;
        }
        if (status.b() && parcelfiledescriptor != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        status = String.valueOf(status);
        String s = String.valueOf(parcelfiledescriptor);
        (new StringBuilder(String.valueOf(status).length() + 28 + String.valueOf(s).length())).append("Avatar loaded: status=").append(status).append("  pfd=").append(s);
        if (parcelfiledescriptor == null) goto _L7; else goto _L6
_L6:
        status = new fpz(this, fpy1, parcelfiledescriptor, l, i1, j1);
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L9; else goto _L8
_L8:
        status.executeOnExecutor(a, new Void[0]);
_L11:
        parcelfiledescriptor = null;
_L12:
        if (!e)
        {
            a();
        }
        if (parcelfiledescriptor == null) goto _L4; else goto _L10
_L10:
        try
        {
            parcelfiledescriptor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            return;
        }
_L9:
        status.execute(null);
          goto _L11
        status;
        if (!e)
        {
            a();
        }
        if (parcelfiledescriptor != null)
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ParcelFileDescriptor parcelfiledescriptor) { }
        }
        throw status;
_L7:
        a(fpy1, null);
          goto _L12
        status;
          goto _L11
    }

    public void a(Status status, ParcelFileDescriptor parcelfiledescriptor, fpy fpy1, int l)
    {
        a(status, parcelfiledescriptor, -1, -1, 0, fpy1);
    }

    public void a(fpy fpy1)
    {
        if (d.containsKey(fpy1.g))
        {
            fpy1.f.setImageBitmap((Bitmap)d.get(fpy1.g));
            a(fpy1.f);
        } else
        {
            ImageView imageview = fpy1.f;
            a(imageview);
            if (c.e())
            {
                imageview.setTag(fpy1);
                g.add(fpy1);
                a();
                return;
            }
        }
    }

    protected void a(fpy fpy1, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            fpy1.f.setImageBitmap(bitmap);
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = AsyncTask.THREAD_POOL_EXECUTOR;
        }
    }
}
