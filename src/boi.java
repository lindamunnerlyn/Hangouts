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

public final class boi
    implements bos, br
{

    String a;
    private final bnd b = bnd.a();
    private final bof c = bof.a();
    private boj d;
    private Context e;
    private bpn f;
    private ani g;
    private bot h;
    private String i;

    public boi(Context context, ani ani1, String s, String s1)
    {
        e = context;
        g = ani1;
        a = s;
        i = s1;
    }

    private void a(String s, String s1)
    {
        if (f != null)
        {
            bpn bpn1 = f;
            String s2 = s;
            if (TextUtils.isEmpty(s))
            {
                s2 = e.getResources().getString(l.cH);
            }
            bpn1.a(s2);
            f.b(s1);
        }
    }

    public void a(int j)
    {
    }

    public void a(bot bot1)
    {
        h = bot1;
        d = new boj(this);
        c.a(d);
        if (a != null)
        {
            bot1.f().a(0, null, this);
        }
        d.f();
    }

    public void a(po po1)
    {
        f = (bpn)po1.c();
        f.a(e.getResources().getString(l.cH));
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
        Object obj = b.t();
        if (i != null)
        {
            a(i, null);
            return;
        }
        if (obj != null && ((bpd) (obj)).M() == 1)
        {
            gbh.b(obj);
            obj = ((bpd) (obj)).W();
            if (((List) (obj)).size() == 1)
            {
                obj = (bpk)((List) (obj)).get(0);
                if (((bpk) (obj)).b() != null)
                {
                    s = ebz.p(((bpk) (obj)).a());
                    obj = ebz.q(((bpk) (obj)).a());
                } else
                {
                    s = ebz.p(((bpk) (obj)).a());
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

    public void i_()
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
        return new cnh(e, g, EsProvider.a(EsProvider.g, h.a().h()), and.a, "conversation_id=?", new String[] {
            a
        }, null);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        Cursor cursor = (Cursor)obj;
        if (em1.o() == 0)
        {
            em1 = b.t();
            if (em1 == null || em1.M() != 1)
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
