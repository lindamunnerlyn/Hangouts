// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.CamcorderProfile;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.android.apps.hangouts.content.EsProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.Random;

public final class auj
{

    private static CamcorderProfile a;

    private static int a(Uri uri, ContentResolver contentresolver)
    {
        ContentResolver contentresolver1;
        ContentResolver contentresolver2;
        contentresolver2 = null;
        contentresolver1 = null;
        contentresolver = contentresolver.openInputStream(uri);
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        int i = g.a(contentresolver, -1L);
        if (contentresolver != null)
        {
            try
            {
                contentresolver.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
                return i;
            }
        }
        return i;
        contentresolver;
        contentresolver2 = contentresolver1;
        uri = String.valueOf(uri);
        contentresolver2 = contentresolver1;
        ebw.e("TempMediaFileUtil", (new StringBuilder(String.valueOf(uri).length() + 35)).append("Error figuring out orientation for ").append(uri).toString(), contentresolver);
        if (contentresolver1 != null)
        {
            try
            {
                contentresolver1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
            }
        }
        return 0;
        uri;
        if (contentresolver2 != null)
        {
            try
            {
                contentresolver2.close();
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", contentresolver);
            }
        }
        throw uri;
    }

    public static atg a(Context context, int i, asz asz1, Uri uri, String s, String s1)
    {
        String s2;
        Object obj1;
        Object obj2;
        atg atg1;
        ContentResolver contentresolver;
        boolean flag;
        boolean flag2;
        flag = true;
        obj2 = null;
        obj1 = null;
        s2 = null;
        Object obj = null;
        flag2 = false;
        g.x();
        atg1 = new atg();
        atg1.b = s;
        if (!a(uri, context, i, atg1))
        {
            return null;
        }
        contentresolver = context.getContentResolver();
        if (s1 != null)
        {
            atg1.d = s1;
        } else
        {
            atg1.d = ean.b(contentresolver, Uri.parse(atg1.a));
        }
        if (asz1 == asz.a)
        {
            if (g.d(atg1.d))
            {
                atg1.c = asz.c;
            } else
            {
                atg1.c = asz.b;
            }
        } else
        {
            atg1.c = asz1;
        }
        if (atg1.c != asz.c) goto _L2; else goto _L1
_L1:
        g.x();
        if (atg1.c != asz.c)
        {
            flag = false;
        }
        g.a(flag);
        asz1 = new MediaMetadataRetriever();
        asz1.setDataSource(context, uri);
        s = asz1.extractMetadata(18);
        s1 = asz1.extractMetadata(19);
        s2 = asz1.extractMetadata(9);
        context = obj;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            context = asz1.extractMetadata(24);
        }
        atg1.e = Integer.parseInt(s1);
        atg1.f = Integer.parseInt(s);
        atg1.h = Integer.parseInt(s2);
        if (context != null) goto _L4; else goto _L3
_L3:
        i = ean.a(contentresolver, uri);
_L5:
        atg1.g = i;
_L6:
        return atg1;
_L4:
        i = Integer.parseInt(context);
          goto _L5
        context;
        atg1.e = 0;
        atg1.f = 0;
        atg1.h = 0;
        atg1.g = 0;
        ebw.f("Babel", "Failed to parse video column strings");
          goto _L6
_L2:
        if (atg1.c != asz.b) goto _L6; else goto _L7
_L7:
        g.x();
        boolean flag1 = flag2;
        if (atg1.c == asz.b)
        {
            flag1 = true;
        }
        g.a(flag1);
        atg1.g = a(uri, contentresolver);
        s1 = new android.graphics.BitmapFactory.Options();
        s1.inJustDecodeBounds = true;
        asz1 = obj2;
        s = obj1;
        context = s2;
        uri = contentresolver.openInputStream(uri);
        asz1 = uri;
        s = uri;
        context = uri;
        BitmapFactory.decodeStream(uri, null, s1);
        asz1 = uri;
        s = uri;
        context = uri;
        atg1.e = ((android.graphics.BitmapFactory.Options) (s1)).outHeight;
        asz1 = uri;
        s = uri;
        context = uri;
        atg1.f = ((android.graphics.BitmapFactory.Options) (s1)).outWidth;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
          goto _L6
        uri;
        context = asz1;
        ebw.e("TempMediaFileUtil", "TempMediaFileUtil: IOEx loading image", uri);
        if (asz1 != null)
        {
            try
            {
                asz1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
          goto _L6
        asz1;
        context = s;
        ebw.b("TempMediaFileUtil", "TempMediaFileUtil: error trying to persist photo, aborting", asz1);
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
          goto _L6
        asz1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
        throw asz1;
          goto _L5
    }

    public static atg a(Context context, int i, asz asz1, String s, String s1)
    {
        g.x();
        s = new File(null, s);
        if (!s.exists())
        {
            return null;
        } else
        {
            return a(context, i, asz1, Uri.fromFile(s), s.getName(), s1);
        }
    }

    public static String a(int i)
    {
        switch (i)
        {
        default:
            return "";

        case 1: // '\001'
            return "camera-p.jpg";

        case 2: // '\002'
            break;
        }
        if (a != null)
        {
            i = a.fileFormat;
            if (i == 2)
            {
                return "camera-p.mp4";
            }
            if (i == 1)
            {
                return "camera-p.3gp";
            } else
            {
                ebw.f("Babel", "Saved video file is not mp4 or 3gpp");
                return "camera-p.3gp";
            }
        } else
        {
            return "";
        }
    }

    private static boolean a(Uri uri, Context context, int i, atg atg1)
    {
        Object obj;
        OutputStream outputstream;
        OutputStream outputstream1;
        OutputStream outputstream2;
        OutputStream outputstream3;
        byte abyte0[];
        Object obj1;
        Object obj2;
        ContentResolver contentresolver;
        boolean flag;
        outputstream = null;
        obj = null;
        outputstream2 = null;
        outputstream1 = null;
        abyte0 = null;
        obj1 = null;
        obj2 = null;
        outputstream3 = null;
        flag = false;
        g.x();
        contentresolver = context.getContentResolver();
        InputStream inputstream = contentresolver.openInputStream(uri);
        context = outputstream;
        obj = inputstream;
        outputstream1 = abyte0;
        outputstream2 = obj1;
        outputstream3 = obj2;
        Uri uri1 = EsProvider.a(i, Math.abs((new Random()).nextLong()));
        context = outputstream;
        obj = inputstream;
        outputstream1 = abyte0;
        outputstream2 = obj1;
        outputstream3 = obj2;
        outputstream = contentresolver.openOutputStream(uri1);
        long l;
        l = 0L;
        context = outputstream;
        obj = inputstream;
        outputstream1 = outputstream;
        outputstream2 = outputstream;
        outputstream3 = outputstream;
        abyte0 = new byte[1024];
_L2:
        context = outputstream;
        obj = inputstream;
        outputstream1 = outputstream;
        outputstream2 = outputstream;
        outputstream3 = outputstream;
        i = inputstream.read(abyte0, 0, 1024);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        context = outputstream;
        obj = inputstream;
        outputstream1 = outputstream;
        outputstream2 = outputstream;
        outputstream3 = outputstream;
        outputstream.write(abyte0, 0, i);
        l += i;
        if (true) goto _L2; else goto _L1
_L1:
        context = outputstream;
        obj = inputstream;
        outputstream1 = outputstream;
        outputstream2 = outputstream;
        outputstream3 = outputstream;
        atg1.i = l;
        context = outputstream;
        obj = inputstream;
        outputstream1 = outputstream;
        outputstream2 = outputstream;
        outputstream3 = outputstream;
        atg1.a = uri1.toString();
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
            }
        }
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
            }
        }
        flag = true;
_L5:
        return flag;
        atg1;
        inputstream = null;
_L12:
        context = outputstream3;
        obj = inputstream;
        uri = String.valueOf(uri.toString());
        context = outputstream3;
        obj = inputstream;
        if (uri.length() == 0) goto _L4; else goto _L3
_L3:
        context = outputstream3;
        obj = inputstream;
        uri = "Gallery picker: bad url ".concat(uri);
_L6:
        context = outputstream3;
        obj = inputstream;
        ebw.e("TempMediaFileUtil", uri, atg1);
        if (outputstream3 != null)
        {
            try
            {
                outputstream3.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
            }
        }
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
                return false;
            }
            return false;
        }
          goto _L5
_L4:
        context = outputstream3;
        obj = inputstream;
        uri = new String("Gallery picker: bad url ");
          goto _L6
        uri;
_L9:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
        throw uri;
        uri;
        inputstream = null;
_L11:
        context = outputstream2;
        obj = inputstream;
        ebw.e("TempMediaFileUtil", "Gallery picker: IOEx loading image", uri);
        if (outputstream2 != null)
        {
            try
            {
                outputstream2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
            }
        }
        if (inputstream == null) goto _L5; else goto _L7
_L7:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            ebw.d("TempMediaFileUtil", "Exception closing", uri);
            return false;
        }
        return false;
        uri;
        inputstream = null;
_L10:
        context = outputstream1;
        obj = inputstream;
        ebw.b("TempMediaFileUtil", "Gallery picker: error trying to persist photo, aborting", uri);
        if (outputstream1 != null)
        {
            try
            {
                outputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ebw.d("TempMediaFileUtil", "Exception closing", uri);
            }
        }
        if (inputstream == null) goto _L5; else goto _L8
_L8:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            ebw.d("TempMediaFileUtil", "Exception closing", uri);
            return false;
        }
        return false;
        uri;
        atg1 = null;
        context = ((Context) (obj));
        obj = atg1;
          goto _L9
        uri;
          goto _L10
        uri;
          goto _L11
        atg1;
          goto _L12
    }

    static 
    {
        try
        {
            a = CamcorderProfile.get(0);
        }
        catch (RuntimeException runtimeexception)
        {
            a = null;
        }
    }
}
