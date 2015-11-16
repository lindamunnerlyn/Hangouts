// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ade
    implements android.provider.Telephony.ThreadsColumns
{

    public static final Uri a;
    private static final String b[] = {
        "_id"
    };
    private static final Uri c = Uri.parse("content://mms-sms/threadID");

    public static long a(Context context, String s)
    {
        HashSet hashset = new HashSet();
        hashset.add(s);
        return a(context, ((Set) (hashset)));
    }

    public static long a(Context context, Set set)
    {
        android.net.Uri.Builder builder = c.buildUpon();
        for (Iterator iterator = set.iterator(); iterator.hasNext(); builder.appendQueryParameter("recipient", set))
        {
            String s = (String)iterator.next();
            set = s;
            if (add.c(s))
            {
                set = add.b(s);
            }
        }

        set = builder.build();
        context = g.a(context.getContentResolver(), set, b, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        long l;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        l = context.getLong(0);
        context.close();
        return l;
        Log.e("Telephony", "getOrCreateThreadId returned no rows!");
        context.close();
        context = String.valueOf(set.toString());
        if (context.length() != 0)
        {
            context = "getOrCreateThreadId failed with uri ".concat(context);
        } else
        {
            context = new String("getOrCreateThreadId failed with uri ");
        }
        Log.e("Telephony", context);
        throw new IllegalArgumentException("Unable to find or allocate a thread ID.");
        set;
        context.close();
        throw set;
    }

    static 
    {
        a = Uri.withAppendedPath(android.provider.Telephony.MmsSms.CONTENT_URI, "conversations");
    }
}
