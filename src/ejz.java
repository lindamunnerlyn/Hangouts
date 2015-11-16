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

public final class ejz
{

    Context a;
    private eka b;

    public ejz(Context context, eka eka)
    {
        a = context;
        b = eka;
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
        s = a.getContentResolver().query(uri, cey.a, "conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?))", new String[] {
            s
        }, "timestamp DESC");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        for (; s.moveToNext(); ((List) (obj)).add(new cew(s, i))) { }
        break MISSING_BLOCK_LABEL_147;
        obj;
        s.close();
        throw obj;
        s.close();
        return ((List) (obj));
    }

    public ekr a(Cursor cursor, aoa aoa1, String s, Uri uri, fvi fvi, long l, 
            Map map)
    {
        int i = aoa1.h();
        eka eka = b;
        hlt hlt1 = new hlt(a);
        hlt1.getBinder().a(gqu, new ejy((gqz)hlp.a(a, gqz), i));
        s = new ekb(this, hlt1, s, uri, fvi, l, eka);
        s.a(cursor, aoa1.h(), map);
        return ((ekb) (s)).j;
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
                cew cew1 = (cew)((Iterator) (obj)).next();
                eks eks1 = new eks();
                eks1.a(cew1.j);
                if (cew1.b != null)
                {
                    eks1.a(cew1.b.toString());
                }
                eks1.a(cew1.a);
                eks1.b(Long.parseLong(cew1.l));
                eks1.a(cew1.d);
                eks1.a(cew1.n);
                i = cew1.e;
                j = cew1.f;
                if (g.e(i))
                {
                    if (j == 1)
                    {
                        i = ekp.c;
                    } else
                    {
                        i = ekp.b;
                    }
                } else
                {
                    i = ekp.a;
                }
                eks1.b(i);
                if (cew1.o.c)
                {
                    eks1.b(cew1.m);
                    eks1.c(cew1.q);
                }
                s.add(eks1.a());
                if (cew1.a == dsv.c && cew1.o.c && cew1.i != null)
                {
                    map.put(cew1.m, cew1.i);
                }
            } while (true);
        }
        return s;
    }
}
