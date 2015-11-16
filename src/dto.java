// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public abstract class dto extends ContentProvider
{

    public static final Random a = new Random();

    public dto()
    {
    }

    public static boolean a(File file)
    {
        boolean flag;
        File file1 = file.getParentFile();
        if (!file1.exists() && !file1.mkdirs())
        {
            break MISSING_BLOCK_LABEL_35;
        }
        flag = file.createNewFile();
        return flag;
        file;
        eev.d("Babel", "FileProvider: Failed to create file", file);
        return false;
    }

    private static boolean b(String s)
    {
        int i;
        if (s.startsWith("/"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        for (; i < s.length(); i++)
        {
            if (!Character.isDigit(s.charAt(i)))
            {
                return false;
            }
        }

        return true;
    }

    public abstract File a(String s);

    public int delete(Uri uri, String s, String as[])
    {
        boolean flag = false;
        s = uri.getPath();
        int i = ((flag) ? 1 : 0);
        if (b(s))
        {
            uri.getQueryParameter("ext");
            i = ((flag) ? 1 : 0);
            if (a(s).delete())
            {
                i = 1;
            }
        }
        return i;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        return null;
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        String s1 = uri.getPath();
        if (b(s1))
        {
            uri.getQueryParameter("ext");
            uri = a(s1);
            int i;
            if (TextUtils.equals(s, "r"))
            {
                i = 0x10000000;
            } else
            {
                i = 0x24000000;
            }
            return ParcelFileDescriptor.open(uri, i);
        } else
        {
            return null;
        }
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        return null;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }

}
