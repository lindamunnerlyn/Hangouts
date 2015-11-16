// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class edr
{

    public static ecp a;
    private static final boolean b = false;
    private static final gdw c;
    private static MediaMetadataRetriever d;
    private static Boolean e;
    private static final Object f = new Object();

    public static int a(ContentResolver contentresolver, Uri uri)
    {
        if (!b(uri)) goto _L2; else goto _L1
_L1:
        contentresolver = contentresolver.query(uri, new String[] {
            "orientation"
        }, null, null, null);
        if (contentresolver == null) goto _L4; else goto _L3
_L3:
        if (!contentresolver.moveToFirst()) goto _L4; else goto _L5
_L5:
        int i = contentresolver.getInt(0);
_L7:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        return i;
        uri;
        contentresolver = null;
_L6:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        throw uri;
        uri;
        if (true) goto _L6; else goto _L4
_L4:
        i = 0;
        if (true) goto _L7; else goto _L2
_L2:
        return 0;
    }

    public static Bitmap a(int i)
    {
        Bitmap bitmap1 = BitmapFactory.decodeResource(g.nU.getResources(), i);
        Bitmap bitmap = a(bitmap1);
        b(bitmap1);
        bitmap1 = bitmap.copy(bitmap.getConfig(), false);
        b(bitmap);
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1 = null;
        Object obj = bitmap;
        if (bitmap.getWidth() != bitmap.getHeight())
        {
            int i = Math.min(bitmap.getWidth(), bitmap.getHeight());
            bitmap1 = a().b(i, i);
            (new Canvas(bitmap1)).drawBitmap(bitmap, new Rect((bitmap.getWidth() - i) / 2, (bitmap.getHeight() - i) / 2, (bitmap.getWidth() + i) / 2, (bitmap.getHeight() + i) / 2), new Rect(0, 0, i, i), new Paint());
            obj = bitmap1;
        }
        int j = ((Bitmap) (obj)).getWidth();
        bitmap = a().b(j, j);
        Canvas canvas = new Canvas(bitmap);
        obj = new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(((android.graphics.Shader) (obj)));
        canvas.drawRoundRect(new RectF(0.0F, 0.0F, j, j), j, j, paint);
        if (bitmap1 != null)
        {
            a().a(bitmap1);
        }
        return bitmap;
    }

    public static Bitmap a(Uri uri)
    {
        if (d == null)
        {
            d = new MediaMetadataRetriever();
        }
        try
        {
            d.setDataSource(g.nU, uri);
            uri = d.getFrameAtTime(-1L);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }

    public static ecp a()
    {
        if (a == null)
        {
            synchronized (f)
            {
                if (a == null)
                {
                    eev.a("Babel", "Initialize BitmapCache");
                    g.nU.getResources();
                    a = new ecp(g.nU, aon.b());
                    c.a(a);
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(File file, String s, String s1)
    {
        s = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        if (TextUtils.isEmpty(s1))
        {
            s1 = new Date(System.currentTimeMillis());
            int i = l.by;
            return b(file, (new SimpleDateFormat(g.nU.getString(i), Locale.US)).format(s1), s);
        } else
        {
            return (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(".").append(s).toString();
        }
    }

    public static void a(edq edq1)
    {
        String s1;
        eef eef1;
        boolean flag;
        s1 = edq1.s();
        eef1 = a().a(s1);
        String s = String.valueOf(s1);
        int i;
        int j;
        int k;
        int i1;
        if (s.length() != 0)
        {
            s = "trying to remove bitmap cache for ".concat(s);
        } else
        {
            s = new String("trying to remove bitmap cache for ");
        }
        eev.e("Babel", s);
        if (eef1 == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (eef1 == null) goto _L2; else goto _L1
_L1:
        i = edq1.d();
        j = edq1.e();
        k = eef1.e().getWidth();
        i1 = eef1.e().getHeight();
        if (b)
        {
            s = String.valueOf(edq1.s());
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 122)).append("check bitmap cache for ").append(s).append(", check cached entry, cached size: ").append(k).append("x").append(i1).append(", requested size: ").append(i).append("x").append(j).toString());
        }
        if (k < i && i1 < j) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        if (flag)
        {
            eev.e("Babel", "cached image size is ok, keep bitmap cache.");
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        eev.e("Babel", "cached bitmap size is smaller than expected, invalidate cache now");
        eef1.b();
        if (!a().b(s1))
        {
            eev.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 35)).append("failed to remove ").append(s1).append(" from bitmap cache").toString());
        }
        cdg.a(edq1.t());
        return;
    }

    public static boolean a(Context context)
    {
        if (e != null)
        {
            return g.a(e, false);
        }
        context = (ActivityManager)context.getSystemService("activity");
        int i = context.getMemoryClass();
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = context.isLowRamDevice();
        } else
        {
            flag = false;
        }
        if (i >= 24 && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = Boolean.valueOf(flag);
        e = context;
        return g.a(context, false);
    }

    public static byte[] a(Bitmap bitmap, int i)
    {
        byte abyte0[];
        boolean flag;
        int j;
        j = 0;
        abyte0 = null;
        flag = false;
_L2:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[];
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, bytearrayoutputstream);
        abyte1 = bytearrayoutputstream.toByteArray();
        abyte0 = abyte1;
        flag = true;
        continue; /* Loop/switch isn't completed */
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        eev.f("Babel", "OutOfMemory converting bitmap to bytes.");
        j++;
        if (j <= 1)
        {
            c.a();
        } else
        {
            eev.f("Babel", "Failed to convert bitmap to bytes. Out of Memory.");
            flag = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
        return abyte0;
    }

    public static byte[] a(InputStream inputstream)
    {
        Object obj;
        byte abyte0[];
        int i;
        obj = null;
        abyte0 = null;
        i = 0;
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        return abyte0;
_L2:
        byte abyte1[];
        boolean flag;
        abyte1 = new byte[128];
        flag = false;
_L10:
        abyte0 = ((byte []) (obj));
        if (flag) goto _L1; else goto _L3
_L3:
        Object obj1 = new ByteArrayOutputStream();
_L6:
        int j = inputstream.read(abyte1, 0, 128);
        if (j == -1) goto _L5; else goto _L4
_L4:
        ((ByteArrayOutputStream) (obj1)).write(abyte1, 0, j);
          goto _L6
        obj1;
        eev.f("Babel", "OutOfMemory trying to create inputStream to bytes in ImageUtils.");
        int k = i + 1;
        if (k > 1) goto _L8; else goto _L7
_L7:
        c.a();
        j = ((flag) ? 1 : 0);
_L11:
        i = k;
        flag = j;
        if (inputstream == null) goto _L10; else goto _L9
_L9:
        inputstream.close();
        i = k;
        flag = j;
          goto _L10
        obj1;
        eev.e("Babel", "Error trying to close input stream", ((Throwable) (obj1)));
        i = k;
        flag = j;
          goto _L10
_L5:
        obj1 = ((ByteArrayOutputStream) (obj1)).toByteArray();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        inputstream.close();
        obj = obj1;
        flag = true;
          goto _L10
        obj;
        eev.e("Babel", "Error trying to close input stream", ((Throwable) (obj)));
        obj = obj1;
        flag = true;
          goto _L10
_L8:
        eev.f("Babel", "Getting bitmap from uri failed in ImageUtils. Out of Memory.");
        j = 1;
          goto _L11
        obj1;
        eev.e("Babel", "Error trying to convert input stream into bytes in ImageUtils: ", ((Throwable) (obj1)));
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        inputstream.close();
        flag = true;
          goto _L10
        obj1;
        eev.e("Babel", "Error trying to close input stream", ((Throwable) (obj1)));
        flag = true;
          goto _L10
        obj;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                eev.e("Babel", "Error trying to close input stream", inputstream);
            }
        }
        throw obj;
        flag = true;
          goto _L10
        obj = obj1;
        flag = true;
          goto _L10
    }

    public static String b(ContentResolver contentresolver, Uri uri)
    {
        if (!b(uri)) goto _L2; else goto _L1
_L1:
        Cursor cursor = contentresolver.query(uri, new String[] {
            "mime_type"
        }, null, null, null);
        if (cursor == null) goto _L4; else goto _L3
_L3:
        if (!cursor.moveToFirst()) goto _L4; else goto _L5
_L5:
        Object obj = cursor.getString(0);
_L9:
        contentresolver = ((ContentResolver) (obj));
        if (cursor != null)
        {
            cursor.close();
            contentresolver = ((ContentResolver) (obj));
        }
_L6:
        obj = contentresolver;
        if (contentresolver == null)
        {
            obj = g.a(uri.toString(), "image/*");
        }
        return ((String) (obj));
        contentresolver;
        cursor = null;
_L7:
        if (cursor != null)
        {
            cursor.close();
        }
        throw contentresolver;
_L2:
        if (uri.toString().endsWith(".gif"))
        {
            contentresolver = "image/gif";
        } else
        {
            contentresolver = null;
        }
          goto _L6
        contentresolver;
          goto _L7
_L4:
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static String b(File file, String s, String s1)
    {
        String s2 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(".").append(s1).toString();
        if ((new File(file, s2)).exists()) goto _L2; else goto _L1
_L1:
        s = s2;
_L4:
        return s;
_L2:
        String s3 = (new StringBuilder(String.valueOf(s).length() + 6 + String.valueOf(s1).length())).append(s).append(" (%d).").append(s1).toString();
        int i = 1;
label0:
        do
        {
label1:
            {
                if (i > 99)
                {
                    break label1;
                }
                s1 = String.format(Locale.US, s3, new Object[] {
                    Integer.valueOf(i)
                });
                s = s1;
                if (!(new File(file, s1)).exists())
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        eev.g("Babel", "Too many duplicate final names. Aborted trying to create new file name");
        return null;
    }

    private static void b(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            a().a(bitmap);
        }
    }

    private static boolean b(Uri uri)
    {
        String s = uri.getAuthority();
        return TextUtils.equals("content", uri.getScheme()) && (TextUtils.equals("media", s) || TextUtils.equals("com.android.providers.media.documents", s));
    }

    static 
    {
        hnc hnc = eev.d;
        c = gdw.a;
    }
}
