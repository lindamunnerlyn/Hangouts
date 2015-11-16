// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;

public final class frk
{

    public static final String a[] = {
        "contact_id", "display_name", "mimetype", "data1", "data2", "data3"
    };
    private static boolean b = false;
    private static boolean c = false;

    public static final String a()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return null;
        } else
        {
            return "((data_set IS NULL) OR (account_type='com.google' AND data_set!='plus'))";
        }
    }

    public static final void a(ftc ftc1)
    {
        ftc1.b("(mimetype IN ('vnd.android.cursor.item/email_v2','vnd.android.cursor.item/phone_v2'))");
    }

    public static final void a(ftc ftc1, boolean flag, Context context)
    {
        if (!flag)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                if (a(context))
                {
                    ftc1.b("(contact_id IN (SELECT _id FROM default_directory))");
                }
            } else
            {
                ftc1.b("(in_visible_group=1)");
            }
        }
        context = a();
        if (!TextUtils.isEmpty(context))
        {
            ftc1.b(context);
        }
    }

    private static final boolean a(Context context)
    {
        frk;
        JVM INSTR monitorenter ;
        if (!c) goto _L2; else goto _L1
_L1:
        boolean flag = b;
_L4:
        frk;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c = true;
        Cursor cursor = context.getContentResolver().query(android.provider.ContactsContract.Groups.CONTENT_URI, null, "EXISTS (SELECT _id FROM default_directory LIMIT 1)", null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        context = cursor;
        b = true;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        cursor.close();
_L6:
        flag = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception1;
        exception1;
        cursor = null;
_L9:
        context = cursor;
        g.m(5);
        context = cursor;
        exception1.getMessage();
        context = cursor;
        g.m(3);
        if (cursor == null) goto _L6; else goto _L5
_L5:
        cursor.close();
          goto _L6
        context;
        throw context;
        Exception exception;
        exception;
        context = null;
_L8:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        context.close();
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        exception1;
          goto _L9
    }

    public static boolean a(Cursor cursor)
    {
        if (!cursor.isAfterLast())
        {
            long l = cursor.getLong(0);
            while (cursor.moveToNext()) 
            {
                if (l != cursor.getLong(0))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Cursor cursor)
    {
        boolean flag;
        if (!cursor.isBeforeFirst())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        if (!cursor.isAfterLast())
        {
            long l = cursor.getLong(0);
            if (cursor.moveToNext() && l == cursor.getLong(0))
            {
                return true;
            }
        }
        return false;
    }

}
