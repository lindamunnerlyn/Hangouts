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

final class bzz
    implements bzu
{

    private final Context a;
    private final chz b;
    private final ContentResolver c;

    bzz(Context context)
    {
        a = context;
        b = (chz)hgx.a(context, chz);
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
        if (b.a("android.permission.WRITE_CONTACTS")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = bzx.c.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(i));
        builder.appendQueryParameter("gaia_id", s);
        s = new bzy(null, c.query(builder.build(), bzx.f, null, null, null));
label0:
        do
        {
label1:
            {
                if (!s.moveToNext())
                {
                    break label1;
                }
                Object obj1 = s.a();
                if (TextUtils.isEmpty(((amf) (obj1)).m()))
                {
                    break label0;
                }
                if (!((amf) (obj1)).d().isEmpty())
                {
                    Object obj = ((amf) (obj1)).m();
                    obj1 = ((amd)((amf) (obj1)).d().iterator().next()).b();
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
                } else
                if (!((amf) (obj1)).b().isEmpty())
                {
                    a(((amf) (obj1)).m(), ((aml)((amf) (obj1)).b().iterator().next()).b());
                }
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
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
