// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

final class fow extends for
{

    private static final String j[] = {
        "contact_id"
    };

    public fow(Context context, fov fov, boolean flag, int i, Bundle bundle, Bundle bundle1, String s)
    {
        super(context, fov, flag, i, bundle, bundle1, s);
    }

    private String d()
    {
        String s = null;
        if (f) goto _L2; else goto _L1
_L1:
        s = "";
_L4:
        return s;
_L2:
        Cursor cursor;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("contact_id IN(");
        cursor = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, j, e(), null, null);
        if (cursor == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        stringbuilder.append(",");
        stringbuilder.append(cursor.getLong(0));
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        stringbuilder.append(")");
        cursor.close();
        return stringbuilder.toString();
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    private String e()
    {
        h.a(f);
        Object obj = a();
        h.a(obj);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("data1 IN(");
        obj = new fou(((com.google.android.gms.common.data.DataHolder) (obj)));
        boolean flag = true;
        for (; ((fou) (obj)).c(); DatabaseUtils.appendEscapedSQLString(stringbuilder, ((fou) (obj)).a("value")))
        {
            if (!flag)
            {
                stringbuilder.append(",");
            }
            flag = false;
        }

        stringbuilder.append(")");
        return stringbuilder.toString();
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
        int i1 = a(cursor, fqm1, fpj1, hashmap1);
        h.a("contact-map finish");
        if (g.m(3))
        {
            (new StringBuilder("#people=")).append(i).append(", #contacts=").append(i1);
            g.m(3);
        }
        h.a("merge start");
        fou1.a(0);
        cursor.moveToPosition(0);
        ArrayList arraylist = new ArrayList();
        do
        {
            String s;
            int k;
            int j1;
            if (!fou1.d())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (!cursor.isAfterLast())
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (k == 0 && j1 == 0)
            {
                break;
            }
            if (k != 0)
            {
                fou2 = fou1.a("name");
            } else
            {
                fou2 = null;
            }
            if (j1 != 0)
            {
                s = cursor.getString(1);
            } else
            {
                s = null;
            }
            if (k != 0 && j1 != 0)
            {
                k = a(((String) (fou2)), s);
            } else
            if (k != 0)
            {
                k = -1;
            } else
            {
                k = 1;
            }
            if (k <= 0)
            {
                j1 = fou1.b();
                fou2 = fou1.a("gaia_id");
                fpk1.a(j1);
                arraylist.add(fou2);
                if (fou2 == null || fqm1.a(fou2) == 0)
                {
                    fpk2.b();
                } else
                {
                    fpk2.a(fqm1, fou2);
                }
                fou1.c();
            }
            if (k >= 0)
            {
                j1 = cursor.getPosition();
                int k1 = fpj1.a(j1);
                if (k1 == 0)
                {
                    fpk1.b();
                    fpk2.a(j1);
                    arraylist.add(null);
                } else
                {
                    int l = 0;
                    while (l < k1) 
                    {
                        fou2 = fpj1.a(j1, l);
                        if (!hashmap.containsKey(fou2))
                        {
                            fpk1.b();
                            fpk2.a(j1);
                            arraylist.add(fou2);
                        }
                        l++;
                    }
                }
                foo.a(cursor);
            }
        } while (true);
        h.a("merge finish");
        return new foj(fou1.a, cursor, a, fpk1.a(), fpk1, fpk2, arraylist, hashmap1, c, e);
    }

    protected Cursor c()
    {
        Object obj1 = null;
        Object obj = d();
        if (obj != null)
        {
            if (i && android.os.Build.VERSION.SDK_INT >= 18)
            {
                obj1 = fop.a.buildUpon();
                fqj fqj2;
                boolean flag;
                if (!b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = ((android.net.Uri.Builder) (obj1)).appendQueryParameter("visible_contacts_only", String.valueOf(flag)).build();
                fqj2 = new fqj();
                fqj2.b(foo.a());
                fqj2.b(((String) (obj)));
                fqj2.b("(data1 IS NOT NULL AND data1!='')");
                obj = a.getContentResolver().query(((Uri) (obj1)), foo.a, fqj2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            } else
            {
                fqj fqj1 = new fqj();
                foo.a(fqj1, b, a);
                foo.a(fqj1);
                fqj1.b(((String) (obj)));
                fqj1.b("(data1 IS NOT NULL AND data1!='')");
                obj = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, foo.a, fqj1.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            }
            obj1 = obj;
            if (obj != null)
            {
                ((Cursor) (obj)).getCount();
                return ((Cursor) (obj));
            }
        }
        return ((Cursor) (obj1));
    }

}
