// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;

public final class hko
{

    private static final String a[] = {
        "_data"
    };

    public static String a(ContentResolver contentresolver, Uri uri)
    {
        contentresolver = contentresolver.query(uri, new String[] {
            "_data"
        }, null, null, null);
        if (contentresolver == null)
        {
            if (Log.isLoggable("ContentUriUtils", 5))
            {
                contentresolver = String.valueOf(uri);
                (new StringBuilder(String.valueOf(contentresolver).length() + 48)).append("getFilePath: query returned null cursor for uri=").append(contentresolver);
            }
            return null;
        }
        if (contentresolver.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (Log.isLoggable("ContentUriUtils", 5))
        {
            uri = String.valueOf(uri);
            (new StringBuilder(String.valueOf(uri).length() + 49)).append("getFilePath: query returned empty cursor for uri=").append(uri);
        }
        contentresolver.close();
        return null;
        String s;
        s = contentresolver.getString(0);
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if (Log.isLoggable("ContentUriUtils", 5))
        {
            uri = String.valueOf(uri);
            (new StringBuilder(String.valueOf(uri).length() + 49)).append("getFilePath: MediaColumns.DATA was empty for uri=").append(uri);
        }
        contentresolver.close();
        return null;
        contentresolver.close();
        return s;
        uri;
        contentresolver.close();
        throw uri;
    }

    public static boolean a(Uri uri)
    {
        return uri != null && "file".equals(uri.getScheme());
    }

    public static boolean a(String s)
    {
        return "image/gif".equals(s);
    }

    public static String b(ContentResolver contentresolver, Uri uri)
    {
        String s = null;
        String s2 = d(contentresolver, uri);
        String s1;
        s1 = s2;
        s = s2;
        if (!TextUtils.isEmpty(s2))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s = s2;
        s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        s2 = s1;
        s = s1;
        if (!"*/*".equals(s1))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s2 = s1;
        s = s1;
        if (b(uri))
        {
            s = s1;
            try
            {
                s2 = c(contentresolver, uri);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                s2 = s;
                if (Log.isLoggable("ContentUriUtils", 5))
                {
                    contentresolver = String.valueOf(uri);
                    (new StringBuilder(String.valueOf(contentresolver).length() + 27)).append("getMimeType failed for uri=").append(contentresolver);
                    return s;
                }
            }
        }
        return s2;
    }

    public static boolean b(Uri uri)
    {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean b(String s)
    {
        return s != null && s.startsWith("image/");
    }

    private static String c(ContentResolver contentresolver, Uri uri)
    {
        Object obj = contentresolver.query(uri, a, null, null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L3
_L3:
        contentresolver = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(((Cursor) (obj)).getString(0)));
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = contentresolver;
        if (TextUtils.isEmpty(contentresolver))
        {
            boolean flag;
            if (b(uri) && uri.toString().contains("/video/"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            obj = "video/*";
        }
        return ((String) (obj));
        contentresolver;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw contentresolver;
        return "image/*";
_L2:
        contentresolver = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean c(String s)
    {
        return s != null && s.startsWith("video/");
    }

    private static String d(ContentResolver contentresolver, Uri uri)
    {
        Object obj = null;
        try
        {
            contentresolver = contentresolver.getType(uri);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            contentresolver = obj;
            if (Log.isLoggable("ContentUriUtils", 5))
            {
                contentresolver = String.valueOf(uri);
                (new StringBuilder(String.valueOf(contentresolver).length() + 31)).append("safeGetMimeType failed for uri=").append(contentresolver);
                return null;
            }
        }
        return contentresolver;
    }

}
