// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

final class fox extends for
{

    public static final String j[] = {
        "contact_id"
    };
    private final String k;

    public fox(Context context, fov fov, boolean flag, int i, Bundle bundle, Bundle bundle1, String s)
    {
        super(context, fov, flag, i, bundle, bundle1, null);
        k = s;
    }

    protected foj a(fou fou1, fou fou2, Cursor cursor)
    {
        h.a(fou1);
        h.a(cursor);
        fpk fpk1 = new fpk();
        fpk fpk2 = new fpk();
        int i = fou1.a();
        cursor.getCount();
        HashMap hashmap = new HashMap();
        h.a("people-map start");
        a(fou1, hashmap);
        h.a("people-map finish");
        fqm fqm1 = new fqm();
        fpj fpj1 = new fpj();
        HashMap hashmap1 = new HashMap();
        b(fou2, hashmap1);
        h.a("contact-map start");
        int j1 = a(cursor, fqm1, fpj1, hashmap1);
        h.a("contact-map finish");
        if (g.m(3))
        {
            (new StringBuilder("#people=")).append(i).append(", #contacts=").append(j1);
            g.m(3);
        }
        h.a("merge start");
        fou2 = new ArrayList();
        fou1.a(-1);
        while (fou1.c()) 
        {
            int l = fou1.b();
            String s1 = fou1.a("gaia_id");
            fpk1.a(l);
            fou2.add(s1);
            if (s1 == null || fqm1.a(s1) == 0)
            {
                fpk2.b();
            } else
            {
                fpk2.a(fqm1, s1);
            }
        }
        cursor.moveToPosition(0);
        while (!cursor.isAfterLast()) 
        {
            int k1 = cursor.getPosition();
            int l1 = fpj1.a(k1);
            if (l1 == 0)
            {
                fpk1.b();
                fpk2.a(k1);
                fou2.add(null);
            } else
            {
                int i1 = 0;
                while (i1 < l1) 
                {
                    String s = fpj1.a(k1, i1);
                    if (!hashmap.containsKey(s))
                    {
                        fpk1.b();
                        fpk2.a(k1);
                        fou2.add(s);
                    }
                    i1++;
                }
            }
            foo.a(cursor);
        }
        h.a("merge finish");
        return new foj(fou1.a, cursor, a, fpk1.a(), fpk1, fpk2, fou2, hashmap1, c, e);
    }

    protected Cursor c()
    {
        if (!i || android.os.Build.VERSION.SDK_INT < 18) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = fop.b.buildUpon().appendPath(k);
        fqj fqj1;
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.net.Uri.Builder) (obj)).appendQueryParameter("visible_contacts_only", String.valueOf(flag)).build();
        fqj1 = new fqj();
        fqj1.b(foo.a());
        fqj1.b("(data1 IS NOT NULL AND data1!='')");
        obj = a.getContentResolver().query(((Uri) (obj)), foo.a, fqj1.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).getCount();
        }
        return ((Cursor) (obj));
_L2:
        fqj fqj2;
        Object obj1;
        fqj2 = new fqj();
        foo.a(fqj2, b, a);
        foo.a(fqj2);
        h.a("lookup start");
        obj = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI.buildUpon().appendPath(k).appendQueryParameter("limit", Integer.toString(100)).build();
        obj = a.getContentResolver().query(((Uri) (obj)), j, "(data1 IS NOT NULL AND data1!='')", null, null);
        obj1 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI.buildUpon().appendPath(k).appendQueryParameter("limit", Integer.toString(100)).build();
        obj1 = a.getContentResolver().query(((Uri) (obj1)), j, "(data1 IS NOT NULL AND data1!='')", null, null);
        obj1 = new MergeCursor(new Cursor[] {
            new foy(((Cursor) (obj))), new foy(((Cursor) (obj1)))
        });
        int i;
        i = ((Cursor) (obj1)).getCount();
        h.a("lookup finish");
        if (i == 0)
        {
            ((Cursor) (obj1)).close();
            return null;
        }
        fqj2.b("contact_id IN (");
        obj = "";
_L4:
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        fqj2.a(((String) (obj)));
        fqj2.a(Long.toString(((Cursor) (obj1)).getLong(0)));
        obj = ",";
        if (true) goto _L4; else goto _L3
_L3:
        fqj2.a(")");
        ((Cursor) (obj1)).close();
        obj = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, foo.a, fqj2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        ((Cursor) (obj1)).close();
        throw exception;
    }

}
