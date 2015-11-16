// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class cbc
    implements cax
{

    private final Context a;
    private final cjf b;
    private final ContentResolver c;

    cbc(Context context)
    {
        a = context;
        b = (cjf)hlp.a(context, cjf);
        c = context.getContentResolver();
    }

    private void a(String s, String s1)
    {
        if (s != null)
        {
            s = c.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] {
                "contact_id", "_id"
            }, "contact_id=? and data1=? or data4=?", new String[] {
                s, s1, s1
            }, null);
        } else
        {
            s = c.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] {
                "contact_id", "_id"
            }, "data1=? or data4=?", new String[] {
                s1, s1
            }, null);
        }
        s1 = new HashSet();
        do
        {
            if (!s.moveToNext())
            {
                break;
            }
            String s2 = s.getString(0);
            Object obj = s.getString(1);
            if (!s1.contains(s2))
            {
                obj = android.provider.ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(((String) (obj))).appendQueryParameter("type", "short_text").build();
                c.update(((Uri) (obj)), new ContentValues(), null, null);
                s1.add(s2);
            }
        } while (true);
        s.close();
    }

    public void a(int i, String s)
    {
        if (!b.a("android.permission.WRITE_CONTACTS"))
        {
            return;
        }
        android.net.Uri.Builder builder = cba.c.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(i));
        builder.appendQueryParameter("gaia_id", s);
        s = new cbb(null, c.query(builder.build(), cba.f, null, null, null));
_L2:
        Object obj1;
        boolean flag;
        if (!s.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = s.a();
        flag = TextUtils.isEmpty(((amx) (obj1)).m());
        if (flag)
        {
            s.close();
            return;
        }
        if (!((amx) (obj1)).d().isEmpty())
        {
            Object obj = ((amx) (obj1)).m();
            obj1 = ((amv)((amx) (obj1)).d().iterator().next()).b();
            obj = c.query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[] {
                "_id"
            }, "contact_id=? and data1=?", new String[] {
                obj, obj1
            }, null);
            if (((Cursor) (obj)).moveToNext())
            {
                obj1 = ((Cursor) (obj)).getString(0);
                obj1 = android.provider.ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(((String) (obj1))).appendQueryParameter("type", "short_text").build();
                c.update(((Uri) (obj1)), new ContentValues(), null, null);
            }
            ((Cursor) (obj)).close();
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_254;
        Exception exception;
        exception;
        s.close();
        throw exception;
        if (!((amx) (obj1)).b().isEmpty())
        {
            a(((amx) (obj1)).m(), ((and)((amx) (obj1)).b().iterator().next()).b());
        }
        if (true) goto _L2; else goto _L1
_L1:
        s.close();
        return;
    }

    public void a(String s)
    {
        if (!b.a("android.permission.WRITE_CONTACTS"))
        {
            return;
        } else
        {
            a(((String) (null)), s);
            return;
        }
    }
}
