// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

public final class fqt
{

    static final String a[] = {
        "photo_id"
    };
    static final String b[] = {
        "data15"
    };
    private static final String c[] = {
        "_id"
    };
    private static final String d[] = {
        "contact_id"
    };
    private static final String e[] = {
        "lookup"
    };

    public static long a(Context context, String s, String s1)
    {
        return a(context, s, s1, d);
    }

    private static long a(Context context, String s, String s1, String as[])
    {
        if (TextUtils.isEmpty(s))
        {
            return -1L;
        }
        if (android.os.Build.VERSION.SDK_INT < 15)
        {
            return -1L;
        }
        s1 = fst.c(s1);
        context = context.getContentResolver().query(android.provider.ContactsContract.RawContacts.CONTENT_URI, as, "account_name=?1 AND account_type='com.google' AND sourceid=?2 AND data_set IS 'plus'", fst.a(s, s1), null);
        if (context == null)
        {
            g.m(5);
            return -1L;
        }
        int i;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        i = context.getInt(0);
        long l = i;
        context.close();
        return l;
        context.close();
        g.m(3);
        return -1L;
        s;
        context.close();
        throw s;
    }

    public static Uri a(Context context, long l)
    {
        if (l < 0L)
        {
            return null;
        }
        Uri uri = ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, l);
        context = context.getContentResolver().query(uri, e, null, null, null);
        if (context == null)
        {
            g.m(5);
            return null;
        }
        Object obj;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = context.getString(0);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        g.m(3);
        context.close();
        return null;
        obj = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath(((String) (obj))).appendPath(String.valueOf(l)).build();
        context.close();
        return ((Uri) (obj));
        context.close();
        g.m(3);
        return null;
        Exception exception;
        exception;
        context.close();
        throw exception;
    }

}
