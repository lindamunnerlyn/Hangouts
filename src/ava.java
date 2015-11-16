// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.CamcorderProfile;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import com.google.android.apps.hangouts.content.EsProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public final class ava
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
                eev.d("TempMediaFileUtil", "Exception closing", uri);
                return i;
            }
        }
        return i;
        contentresolver;
        contentresolver2 = contentresolver1;
        uri = String.valueOf(uri);
        contentresolver2 = contentresolver1;
        eev.e("TempMediaFileUtil", (new StringBuilder(String.valueOf(uri).length() + 35)).append("Error figuring out orientation for ").append(uri).toString(), contentresolver);
        if (contentresolver1 != null)
        {
            try
            {
                contentresolver1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                eev.d("TempMediaFileUtil", "Exception closing", uri);
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
                eev.d("TempMediaFileUtil", "Exception closing", contentresolver);
            }
        }
        throw uri;
    }

    public static Uri a(ContentResolver contentresolver, String s, atp atp1)
    {
        boolean flag;
        if (atp1 == atp.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        atp1 = new ContentValues();
        atp1.put("_data", s);
        if (!flag) goto _L2; else goto _L1
_L1:
        s = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
_L4:
        return contentresolver.insert(s, atp1);
_L2:
        s = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        eev.d("TempMediaFileUtil", "Insert failed!", s);
        if (!flag) goto _L6; else goto _L5
_L5:
        s = android.provider.MediaStore.Video.Media.getContentUri("phoneStorage");
_L8:
        return contentresolver.insert(s, atp1);
_L6:
        s = android.provider.MediaStore.Images.Media.getContentUri("phoneStorage");
        if (true) goto _L8; else goto _L7
_L7:
        contentresolver;
        eev.e("TempMediaFileUtil", "Failed to save media file.", contentresolver);
        return null;
    }

    public static atx a(Context context, int i, atp atp1, Uri uri, String s, String s1)
    {
        String s2;
        Object obj1;
        Object obj2;
        atx atx1;
        ContentResolver contentresolver;
        boolean flag;
        boolean flag2;
        flag = true;
        obj2 = null;
        obj1 = null;
        s2 = null;
        Object obj = null;
        flag2 = false;
        g.w();
        atx1 = new atx();
        atx1.b = s;
        if (!a(uri, context, i, atx1))
        {
            return null;
        }
        contentresolver = context.getContentResolver();
        if (s1 != null)
        {
            atx1.d = s1;
        } else
        {
            atx1.d = edr.b(contentresolver, Uri.parse(atx1.a));
        }
        if (atp1 == atp.a)
        {
            if (g.d(atx1.d))
            {
                atx1.c = atp.c;
            } else
            {
                atx1.c = atp.b;
            }
        } else
        {
            atx1.c = atp1;
        }
        if (atx1.c != atp.c) goto _L2; else goto _L1
_L1:
        g.w();
        if (atx1.c != atp.c)
        {
            flag = false;
        }
        g.c(flag);
        atp1 = new MediaMetadataRetriever();
        atp1.setDataSource(context, uri);
        s = atp1.extractMetadata(18);
        s1 = atp1.extractMetadata(19);
        s2 = atp1.extractMetadata(9);
        context = obj;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            context = atp1.extractMetadata(24);
        }
        atx1.e = Integer.parseInt(s1);
        atx1.f = Integer.parseInt(s);
        atx1.h = Integer.parseInt(s2);
        if (context != null) goto _L4; else goto _L3
_L3:
        i = edr.a(contentresolver, uri);
_L5:
        atx1.g = i;
_L6:
        return atx1;
_L4:
        i = Integer.parseInt(context);
          goto _L5
        context;
        atx1.e = 0;
        atx1.f = 0;
        atx1.h = 0;
        atx1.g = 0;
        eev.f("Babel", "Failed to parse video column strings");
          goto _L6
_L2:
        if (atx1.c != atp.b) goto _L6; else goto _L7
_L7:
        g.w();
        boolean flag1 = flag2;
        if (atx1.c == atp.b)
        {
            flag1 = true;
        }
        g.c(flag1);
        atx1.g = a(uri, contentresolver);
        s1 = new android.graphics.BitmapFactory.Options();
        s1.inJustDecodeBounds = true;
        atp1 = obj2;
        s = obj1;
        context = s2;
        uri = contentresolver.openInputStream(uri);
        atp1 = uri;
        s = uri;
        context = uri;
        BitmapFactory.decodeStream(uri, null, s1);
        atp1 = uri;
        s = uri;
        context = uri;
        atx1.e = ((android.graphics.BitmapFactory.Options) (s1)).outHeight;
        atp1 = uri;
        s = uri;
        context = uri;
        atx1.f = ((android.graphics.BitmapFactory.Options) (s1)).outWidth;
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                eev.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
          goto _L6
        uri;
        context = atp1;
        eev.e("TempMediaFileUtil", "TempMediaFileUtil: IOEx loading image", uri);
        if (atp1 != null)
        {
            try
            {
                atp1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                eev.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
          goto _L6
        atp1;
        context = s;
        eev.b("TempMediaFileUtil", "TempMediaFileUtil: error trying to persist photo, aborting", atp1);
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                eev.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
          goto _L6
        atp1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                eev.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
        throw atp1;
          goto _L5
    }

    public static atx a(Context context, int i, atp atp1, String s, String s1)
    {
        g.w();
        s = new File(null, s);
        if (!s.exists())
        {
            return null;
        } else
        {
            return a(context, i, atp1, Uri.fromFile(s), s.getName(), s1);
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
                eev.f("Babel", "Saved video file is not mp4 or 3gpp");
                return "camera-p.3gp";
            }
        } else
        {
            return "";
        }
    }

    public static String a(Uri uri)
    {
        Object obj1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Hangouts");
        Object obj = obj1;
        if (!((File) (obj1)).exists())
        {
            obj = obj1;
            if (!((File) (obj1)).mkdirs())
            {
                obj = String.valueOf(((File) (obj1)).getPath());
                if (((String) (obj)).length() != 0)
                {
                    obj = "Create Directory failed: ".concat(((String) (obj)));
                } else
                {
                    obj = new String("Create Directory failed: ");
                }
                eev.f("TempMediaFileUtil", ((String) (obj)));
                obj = null;
            }
        }
        if (obj == null)
        {
            return null;
        }
        obj1 = (new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault())).format(new Date());
        String s = String.valueOf("image-");
        String s1 = String.valueOf(".jpg");
        obj = new File(((File) (obj)), (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(obj1).length() + String.valueOf(s1).length())).append(s).append(((String) (obj1))).append(s1).toString());
        try
        {
            jyz.a(new File(uri.getPath()), ((File) (obj)));
            uri = ((File) (obj)).getPath();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            eev.d("TempMediaFileUtil", "Failed to copy an image file.", uri);
            return null;
        }
        return uri;
    }

    private static boolean a(Uri uri, Context context, int i, atx atx1)
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
        g.w();
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
        atx1.i = l;
        context = outputstream;
        obj = inputstream;
        outputstream1 = outputstream;
        outputstream2 = outputstream;
        outputstream3 = outputstream;
        atx1.a = uri1.toString();
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                eev.d("TempMediaFileUtil", "Exception closing", uri);
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
                eev.d("TempMediaFileUtil", "Exception closing", uri);
            }
        }
        flag = true;
_L5:
        return flag;
        atx1;
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
        eev.e("TempMediaFileUtil", uri, atx1);
        if (outputstream3 != null)
        {
            try
            {
                outputstream3.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                eev.d("TempMediaFileUtil", "Exception closing", uri);
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
                eev.d("TempMediaFileUtil", "Exception closing", uri);
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
                eev.d("TempMediaFileUtil", "Exception closing", context);
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
                eev.d("TempMediaFileUtil", "Exception closing", context);
            }
        }
        throw uri;
        uri;
        inputstream = null;
_L11:
        context = outputstream2;
        obj = inputstream;
        eev.e("TempMediaFileUtil", "Gallery picker: IOEx loading image", uri);
        if (outputstream2 != null)
        {
            try
            {
                outputstream2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                eev.d("TempMediaFileUtil", "Exception closing", uri);
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
            eev.d("TempMediaFileUtil", "Exception closing", uri);
            return false;
        }
        return false;
        uri;
        inputstream = null;
_L10:
        context = outputstream1;
        obj = inputstream;
        eev.b("TempMediaFileUtil", "Gallery picker: error trying to persist photo, aborting", uri);
        if (outputstream1 != null)
        {
            try
            {
                outputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                eev.d("TempMediaFileUtil", "Exception closing", uri);
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
            eev.d("TempMediaFileUtil", "Exception closing", uri);
            return false;
        }
        return false;
        uri;
        atx1 = null;
        context = ((Context) (obj));
        obj = atx1;
          goto _L9
        uri;
          goto _L10
        uri;
          goto _L11
        atx1;
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
