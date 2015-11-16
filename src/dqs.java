// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class dqs
{

    public static final String a[] = {
        "_id", "mid", "chset", "ct", "text"
    };
    public static final int b = 0;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    private static int o;
    public long g;
    public long h;
    public String i;
    public String j;
    public int k;
    public int l;
    public int m;
    public long n;

    public dqs()
    {
    }

    public static dqs a(Cursor cursor, boolean flag)
    {
        Object obj;
        Object obj2;
        dqs dqs1;
        obj = null;
        obj2 = null;
        dqs1 = new dqs();
        dqs1.g = cursor.getLong(b);
        dqs1.h = cursor.getLong(c);
        dqs1.i = cursor.getString(e);
        dqs1.j = cursor.getString(f);
        dqs1.k = cursor.getInt(d);
        dqs1.l = 0;
        dqs1.m = 0;
        dqs1.n = 0L;
        if (!dqs1.b())
        {
            break MISSING_BLOCK_LABEL_748;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!g.b(dqs1.i)) goto _L4; else goto _L3
_L3:
        Object obj3;
        Object obj4;
        obj4 = g.nS.getContentResolver();
        obj3 = dqs1.d();
        cursor = ((Cursor) (obj2));
        obj2 = ((ContentResolver) (obj4)).openInputStream(((Uri) (obj3)));
        cursor = ((Cursor) (obj2));
        obj = obj2;
        obj4 = new android.graphics.BitmapFactory.Options();
        cursor = ((Cursor) (obj2));
        obj = obj2;
        obj4.inJustDecodeBounds = true;
        cursor = ((Cursor) (obj2));
        obj = obj2;
        BitmapFactory.decodeStream(((InputStream) (obj2)), null, ((android.graphics.BitmapFactory.Options) (obj4)));
        cursor = ((Cursor) (obj2));
        obj = obj2;
        dqs1.i = ((android.graphics.BitmapFactory.Options) (obj4)).outMimeType;
        cursor = ((Cursor) (obj2));
        obj = obj2;
        dqs1.l = ((android.graphics.BitmapFactory.Options) (obj4)).outWidth;
        cursor = ((Cursor) (obj2));
        obj = obj2;
        dqs1.m = ((android.graphics.BitmapFactory.Options) (obj4)).outHeight;
        cursor = ((Cursor) (obj2));
        obj = obj2;
        if (!TextUtils.isEmpty(dqs1.i))
        {
            break MISSING_BLOCK_LABEL_341;
        }
        cursor = ((Cursor) (obj2));
        obj = obj2;
        String s7 = ((Uri) (obj3)).getPath();
        cursor = ((Cursor) (obj2));
        obj = obj2;
        MimeTypeMap mimetypemap = MimeTypeMap.getSingleton();
        cursor = ((Cursor) (obj2));
        obj = obj2;
        obj4 = MimeTypeMap.getFileExtensionFromUrl(s7);
        obj3 = obj4;
        cursor = ((Cursor) (obj2));
        obj = obj2;
        if (!TextUtils.isEmpty(((CharSequence) (obj4))))
        {
            break MISSING_BLOCK_LABEL_325;
        }
        cursor = ((Cursor) (obj2));
        obj = obj2;
        int i1 = s7.lastIndexOf('.');
        obj3 = obj4;
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        cursor = ((Cursor) (obj2));
        obj = obj2;
        obj3 = s7.substring(i1 + 1);
        cursor = ((Cursor) (obj2));
        obj = obj2;
        dqs1.i = mimetypemap.getMimeTypeFromExtension(((String) (obj3)));
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Log.e("Babel_SMS", "IOException caught while closing stream", cursor);
            }
        }
_L5:
        dqs1.n = drk.a(dqs1.d());
_L2:
        return dqs1;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        obj = cursor;
        ebw.e("Babel_SMS", "DatabaseMessages.MmsPart.loadImage: file not found", filenotfoundexception);
        if (cursor != null)
        {
            try
            {
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Log.e("Babel_SMS", "IOException caught while closing stream", cursor);
            }
        }
          goto _L5
        cursor;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                Log.e("Babel_SMS", "IOException caught while closing stream", ioexception);
            }
        }
        throw cursor;
_L4:
        if (!g.d(dqs1.i) || !drk.a()) goto _L5; else goto _L6
_L6:
        ioexception = g.nS;
        filenotfoundexception = dqs1.d();
        cursor = new MediaMetadataRetriever();
        cursor.setDataSource(ioexception, filenotfoundexception);
        ioexception = cursor.getFrameAtTime(-1L);
        dqs1.i = cursor.extractMetadata(12);
        dqs1.l = ioexception.getWidth();
        dqs1.m = ioexception.getHeight();
        try
        {
            cursor.release();
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            String s = String.valueOf("DatabaseMessages.MmsPart.loadVideo: failed to release retriever ");
            String s2 = String.valueOf(cursor);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s2).length())).append(s).append(s2).toString(), cursor);
        }
          goto _L5
        Object obj1;
        obj1;
        String s3 = String.valueOf(obj1);
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s3).length() + 57)).append("DatabaseMessages.MmsPart.loadVideo: failed to load video ").append(s3).toString(), ((Throwable) (obj1)));
        try
        {
            cursor.release();
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            String s1 = String.valueOf("DatabaseMessages.MmsPart.loadVideo: failed to release retriever ");
            String s4 = String.valueOf(cursor);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s4).length())).append(s1).append(s4).toString(), cursor);
        }
          goto _L5
        s1;
        try
        {
            cursor.release();
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            String s5 = String.valueOf("DatabaseMessages.MmsPart.loadVideo: failed to release retriever ");
            String s6 = String.valueOf(cursor);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s5).length() + 0 + String.valueOf(s6).length())).append(s5).append(s6).toString(), cursor);
        }
        throw s1;
        dqs1.e();
        return dqs1;
    }

    private void e()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int i1;
        obj = null;
        obj1 = null;
        obj2 = null;
        i1 = 0;
        if ("text/plain".equals(i) || "application/smil".equals(i) || "text/html".equals(i))
        {
            i1 = 1;
        }
        if (!i1) goto _L2; else goto _L1
_L1:
        obj = obj2;
        if (!TextUtils.isEmpty(j))
        {
            obj = g.b(j, k);
        }
_L6:
        if (obj != null && obj.length > 0)
        {
            n = obj.length;
            j = g.a(((byte []) (obj)), k);
        }
        return;
_L2:
        ByteArrayOutputStream bytearrayoutputstream;
        Object obj3;
        obj2 = g.nS.getContentResolver();
        obj3 = d();
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj2 = ((ContentResolver) (obj2)).openInputStream(((Uri) (obj3)));
        obj = obj2;
        obj1 = obj2;
        byte abyte0[] = new byte[256];
        obj = obj2;
        obj1 = obj2;
        i1 = ((InputStream) (obj2)).read(abyte0);
_L4:
        if (i1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        obj1 = obj2;
        bytearrayoutputstream.write(abyte0, 0, i1);
        obj = obj2;
        obj1 = obj2;
        i1 = ((InputStream) (obj2)).read(abyte0);
        if (true) goto _L4; else goto _L3
_L3:
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj1 = String.valueOf(obj);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(obj1).length() + 45)).append("DatabaseMessages.MmsPart: close file failed: ").append(((String) (obj1))).toString(), ((Throwable) (obj)));
            }
        }
_L7:
        obj = bytearrayoutputstream.toByteArray();
        if (true) goto _L6; else goto _L5
_L5:
        IOException ioexception2;
        ioexception2;
        obj1 = obj;
        abyte0 = String.valueOf(ioexception2);
        obj1 = obj;
        ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(abyte0).length() + 57)).append("DatabaseMessages.MmsPart: loading text from file failed: ").append(abyte0).toString(), ioexception2);
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                obj1 = String.valueOf(ioexception);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(obj1).length() + 45)).append("DatabaseMessages.MmsPart: close file failed: ").append(((String) (obj1))).toString(), ioexception);
            }
        }
          goto _L7
        Exception exception;
        exception;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception1)
            {
                String s = String.valueOf(ioexception1);
                ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 45)).append("DatabaseMessages.MmsPart: close file failed: ").append(s).toString(), ioexception1);
            }
        }
        throw exception;
    }

    public boolean a()
    {
        return "text/plain".equals(i) || "text/html".equals(i) || "application/vnd.wap.xhtml+xml".equals(i);
    }

    public boolean b()
    {
        return g.b(i) || g.d(i) || g.c(i) || g.e(i);
    }

    public boolean c()
    {
        return g.b(i);
    }

    public Uri d()
    {
        long l1 = g;
        return Uri.parse((new StringBuilder(39)).append("content://mms/part/").append(l1).toString());
    }

    static 
    {
        o = 0;
        o = 1;
        int i1 = o;
        o = i1 + 1;
        c = i1;
        i1 = o;
        o = i1 + 1;
        d = i1;
        i1 = o;
        o = i1 + 1;
        e = i1;
        i1 = o;
        o = i1 + 1;
        f = i1;
    }
}
