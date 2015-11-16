// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

public final class abl
{

    public static final int a;
    private static final Pattern b = Pattern.compile("^(?:.*;)?base64,.*");

    public static abi a(ContentResolver contentresolver, Uri uri, int i)
    {
        abi abi1;
        abi1 = new abi();
        android.graphics.BitmapFactory.Options options;
        if ("data".equals(uri.getScheme()))
        {
            contentresolver = new abn(contentresolver, uri);
        } else
        {
            contentresolver = new abm(contentresolver, uri);
        }
        uri = new android.graphics.BitmapFactory.Options();
        uri.inJustDecodeBounds = true;
        a(((abp) (contentresolver)), ((android.graphics.BitmapFactory.Options) (uri)));
        uri = new Point(((android.graphics.BitmapFactory.Options) (uri)).outWidth, ((android.graphics.BitmapFactory.Options) (uri)).outHeight);
        options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = Math.max(((Point) (uri)).x / i, ((Point) (uri)).y / i);
        abi1.b = a(((abp) (contentresolver)), options);
        abi1.c = 0;
        return abi1;
        contentresolver;
        abi1.c = 1;
_L2:
        return abi1;
        contentresolver;
        abi1.c = 1;
        continue; /* Loop/switch isn't completed */
        contentresolver;
        continue; /* Loop/switch isn't completed */
        contentresolver;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Bitmap a(abp abp1, android.graphics.BitmapFactory.Options options)
    {
        Object obj = abp1.a();
        Object obj1 = obj;
        int i = g.a(((InputStream) (obj)), -1L);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj1 = obj;
        ((InputStream) (obj)).close();
        obj1 = obj;
        abp1 = abp1.a();
        obj = abp1;
        obj1 = BitmapFactory.decodeStream(abp1, null, options);
        if (abp1 == null || obj1 != null) goto _L2; else goto _L1
_L1:
        obj = abp1;
        if (options.inJustDecodeBounds) goto _L2; else goto _L3
_L3:
        obj = abp1;
        throw new UnsupportedOperationException("Image bytes cannot be decoded into a Bitmap.");
        options;
        obj = abp1;
        abp1 = options;
_L11:
        obj1 = obj;
        Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an OOME", abp1);
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (abp abp1) { }
        }
        options = null;
        return options;
_L2:
        if (obj1 == null || i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abp1;
        options = new Matrix();
        obj = abp1;
        options.postRotate(i);
        obj = abp1;
        options = Bitmap.createBitmap(((Bitmap) (obj1)), 0, 0, ((Bitmap) (obj1)).getWidth(), ((Bitmap) (obj1)).getHeight(), options, true);
        obj = options;
        options = ((android.graphics.BitmapFactory.Options) (obj));
        if (abp1 != null)
        {
            try
            {
                abp1.close();
            }
            // Misplaced declaration of an exception variable
            catch (abp abp1)
            {
                return ((Bitmap) (obj));
            }
            return ((Bitmap) (obj));
        }
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_101;
_L4:
        options = ((android.graphics.BitmapFactory.Options) (obj1));
        if (abp1 != null)
        {
            try
            {
                abp1.close();
            }
            // Misplaced declaration of an exception variable
            catch (abp abp1)
            {
                return ((Bitmap) (obj1));
            }
            return ((Bitmap) (obj1));
        } else
        {
            break MISSING_BLOCK_LABEL_101;
        }
        options;
        abp1 = null;
_L9:
        obj = abp1;
        Log.e("ImageUtils", "ImageUtils#decodeStream(InputStream, Rect, Options) threw an IOE", options);
        if (abp1 != null)
        {
            try
            {
                abp1.close();
            }
            // Misplaced declaration of an exception variable
            catch (abp abp1) { }
        }
        return null;
        abp1;
        obj = null;
_L7:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.BitmapFactory.Options options) { }
        }
        throw abp1;
        abp1;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        abp1;
        if (true) goto _L7; else goto _L6
_L6:
        options;
        abp1 = ((abp) (obj));
        continue; /* Loop/switch isn't completed */
        options;
        if (true) goto _L9; else goto _L8
_L8:
        abp1;
        obj = null;
        continue; /* Loop/switch isn't completed */
        abp1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static Pattern a()
    {
        return b;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = abo.c;
        } else
        if ((long)aam.a >= 32L)
        {
            a = abo.c;
        } else
        if ((long)aam.a >= 24L)
        {
            a = abo.b;
        } else
        {
            a = abo.a;
        }
    }
}
