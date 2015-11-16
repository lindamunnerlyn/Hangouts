// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.List;

public final class bor
    implements bpb, br
{

    String a;
    private final bnk b = bnk.a();
    private final boo c = boo.a();
    private bos d;
    private Context e;
    private bpw f;
    private aoa g;
    private bpc h;
    private String i;

    public bor(Context context, aoa aoa1, String s, String s1)
    {
        e = context;
        g = aoa1;
        a = s;
        i = s1;
    }

    private void a(String s, String s1)
    {
        if (f != null)
        {
            bpw bpw1 = f;
            String s2 = s;
            if (TextUtils.isEmpty(s))
            {
                s2 = e.getResources().getString(l.cq);
            }
            bpw1.a(s2);
            f.b(s1);
        }
    }

    public void a(int j)
    {
    }

    public void a(bpc bpc1)
    {
        h = bpc1;
        d = new bos(this);
        c.a(d);
        if (a != null)
        {
            bpc1.f().a(0, null, this);
        }
        d.f();
    }

    public void a(pq pq1)
    {
        f = (bpw)pq1.c();
        f.a(e.getResources().getString(l.cq));
        c();
    }

    void b()
    {
        if (a != null)
        {
            h.f().b(0, null, this);
        }
    }

    void c()
    {
        String s = null;
        Object obj = b.s();
        if (i != null)
        {
            a(i, null);
            return;
        }
        if (obj != null && ((bpm) (obj)).L() == 1)
        {
            gdv.b("Expected non-null", obj);
            obj = ((bpm) (obj)).V();
            if (((List) (obj)).size() == 1)
            {
                obj = (bpt)((List) (obj)).get(0);
                if (((bpt) (obj)).b() != null)
                {
                    s = eey.p(((bpt) (obj)).a());
                    obj = eey.q(((bpt) (obj)).a());
                } else
                {
                    s = eey.p(((bpt) (obj)).a());
                    obj = null;
                }
            } else
            {
                obj = null;
            }
            if (s != null)
            {
                a(s, ((String) (obj)));
                return;
            } else
            {
                b();
                return;
            }
        } else
        {
            b();
            return;
        }
    }

    public void j_()
    {
        if (d != null)
        {
            c.b(d);
            d = null;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public em onCreateLoader(int j, Bundle bundle)
    {
        while (j != 0 || a == null) 
        {
            return null;
        }
        return new coz(e, g, EsProvider.a(EsProvider.g, h.a().h()), anv.a, "conversation_id=?", new String[] {
            a
        }, null);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        Cursor cursor = (Cursor)obj;
        if (em1.o() == 0)
        {
            em1 = b.s();
            if (em1 == null || em1.L() != 1)
            {
                if (i != null)
                {
                    a(i, null);
                } else
                if (cursor != null && cursor.moveToFirst())
                {
                    obj = cursor.getString(3);
                    em1 = ((em) (obj));
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        em1 = cursor.getString(4);
                    }
                    if (!TextUtils.isEmpty(em1))
                    {
                        a(em1, null);
                        return;
                    }
                }
            }
        }
    }

    public void onLoaderReset(em em1)
    {
    }
}
