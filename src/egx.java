// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class egx
{

    Context a;
    private egy b;

    public egx(Context context, egy egy)
    {
        a = context;
        b = egy;
    }

    private List a(int i, String s, int j)
    {
        Object obj;
        Uri uri = EsProvider.a(EsProvider.j, i);
        if (j == 0)
        {
            obj = "20";
        } else
        {
            obj = String.format(Locale.US, "%d,%d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(20)
            });
        }
        uri = uri.buildUpon().appendQueryParameter("limit", ((String) (obj))).build();
        obj = new ArrayList();
        s = a.getContentResolver().query(uri, cdt.a, "conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?))", new String[] {
            s
        }, "timestamp DESC");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        for (; s.moveToNext(); ((List) (obj)).add(new cdr(s, i))) { }
        break MISSING_BLOCK_LABEL_147;
        obj;
        s.close();
        throw obj;
        s.close();
        return ((List) (obj));
    }

    public ehq a(Cursor cursor, ani ani1, String s, Uri uri, ftc ftc, long l, 
            Map map)
    {
        int i = ani1.h();
        egy egy = b;
        hhb hhb1 = new hhb(a);
        hhb1.getBinder().a(gmo, new egw((gms)hgx.a(a, gms), i));
        s = new egz(this, hhb1, s, uri, ftc, l, egy);
        s.a(cursor, ani1.h(), map);
        return ((egz) (s)).j;
    }

    public ArrayList a(int i, String s, int j, Map map)
    {
        Object obj = a(i, s, j);
        s = new ArrayList();
        if (!((List) (obj)).isEmpty())
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                cdr cdr1 = (cdr)((Iterator) (obj)).next();
                ehr ehr1 = new ehr();
                ehr1.a(cdr1.j);
                if (cdr1.b != null)
                {
                    ehr1.a(cdr1.b.toString());
                }
                ehr1.a(cdr1.a);
                ehr1.b(Long.parseLong(cdr1.l));
                ehr1.a(cdr1.d);
                ehr1.a(cdr1.n);
                i = cdr1.e;
                j = cdr1.f;
                if (g.e(i))
                {
                    if (j == 1)
                    {
                        i = eho.c;
                    } else
                    {
                        i = eho.b;
                    }
                } else
                {
                    i = eho.a;
                }
                ehr1.b(i);
                if (cdr1.o.c)
                {
                    ehr1.b(cdr1.m);
                    ehr1.c(cdr1.q);
                }
                s.add(ehr1.a());
                if (cdr1.a == dqc.c && cdr1.o.c && cdr1.i != null)
                {
                    map.put(cdr1.m, cdr1.i);
                }
            } while (true);
        }
        return s;
    }
}
