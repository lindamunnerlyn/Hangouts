// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ayi
    implements ayf, azz, fsn, hjt, hkb
{

    private final Context a;
    private final ayg b;
    private ark c;
    private aih d;
    private int e;
    private String f;
    private String g;
    private amz h;
    private ArrayList i;
    private ayh j;
    private azv k;

    public ayi(Context context, ayg ayg1, hjm hjm1)
    {
        i = new ArrayList();
        a = context;
        b = (ayg)g.d(ayg1);
        hjm1.a(this);
    }

    private void i()
    {
        if (k != null)
        {
            k.cancel(true);
            k = null;
        }
    }

    public ark a()
    {
        return c;
    }

    public ayi a(hgx hgx1)
    {
        hgx1.a(ayf, this);
        return this;
    }

    public void a(int i1)
    {
        e = i1;
    }

    public void a(aih aih1)
    {
        d = aih1;
        f = aih1.g;
        e = aih1.b;
    }

    public void a(amz amz)
    {
        h = amz;
    }

    public void a(Context context, List list, ayh ayh1)
    {
        i = new ArrayList(list);
        j = ayh1;
        b.a(ayh1);
        i();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (!l.b(((asy)list.next()).a))
            {
                continue;
            }
            k = new azv(context, i, this);
            k.execute(new Void[0]);
            break;
        } while (true);
    }

    public void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            f = bundle.getString("conversation_state_model_conversation_name");
            a(a, ((List) (bundle.getParcelableArrayList("conversation_state_model_attachments"))), (ayh)bundle.getSerializable("conversation_state_model_callback"));
            return;
        }
    }

    public void a(ark ark1)
    {
        c = ark1;
    }

    public void a(String s, String s1)
    {
        f = s;
        g = s1;
    }

    public void a(jlk jlk1)
    {
        i = new ArrayList(jlk1);
    }

    public aih b()
    {
        return d;
    }

    public void b(Bundle bundle)
    {
        bundle.putString("conversation_state_model_conversation_name", e());
        ArrayList arraylist = new ArrayList(i.size());
        for (Iterator iterator = i.iterator(); iterator.hasNext(); arraylist.add((Parcelable)(asy)iterator.next())) { }
        bundle.putParcelableArrayList("conversation_state_model_attachments", arraylist);
        bundle.putSerializable("conversation_state_model_callback", j);
    }

    public String c()
    {
        if (c != null)
        {
            return c.a;
        } else
        {
            return d.a;
        }
    }

    public int d()
    {
        return e;
    }

    public String e()
    {
        if (!TextUtils.isEmpty(f))
        {
            return f;
        } else
        {
            return g;
        }
    }

    public amz f()
    {
        return h;
    }

    public jlk g()
    {
        return jlk.a(i);
    }

    public void h()
    {
        i = new ArrayList();
        b.a(null);
        i();
    }
}
