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

final class ayw
    implements ayt, bao, hon, hov, hoy
{

    private final Context a;
    private final ayu b;
    private asa c;
    private aia d;
    private int e;
    private String f;
    private String g;
    private anr h;
    private ArrayList i;
    private ayv j;
    private bak k;

    public ayw(Context context, ayu ayu1, hof hof1)
    {
        i = new ArrayList();
        a = context;
        b = (ayu)g.e(ayu1);
        hof1.a(this);
    }

    private void i()
    {
        if (k != null)
        {
            k.cancel(true);
            k = null;
        }
    }

    public asa a()
    {
        return c;
    }

    public ayw a(hlp hlp1)
    {
        hlp1.a(ayt, this);
        return this;
    }

    public void a(int i1)
    {
        e = i1;
    }

    public void a(aia aia1)
    {
        d = aia1;
        f = aia1.g;
        e = aia1.b;
    }

    public void a(Context context, List list, ayv ayv1)
    {
        i = new ArrayList(list);
        j = ayv1;
        b.a(ayv1);
        i();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (!l.b(((ato)list.next()).a))
            {
                continue;
            }
            k = new bak(context, i, this);
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
            a(a, ((List) (bundle.getParcelableArrayList("conversation_state_model_attachments"))), (ayv)bundle.getSerializable("conversation_state_model_callback"));
            return;
        }
    }

    public void a(anr anr)
    {
        h = anr;
    }

    public void a(asa asa1)
    {
        c = asa1;
    }

    public void a(String s, String s1)
    {
        f = s;
        g = s1;
    }

    public void a(jsh jsh1)
    {
        i = new ArrayList(jsh1);
    }

    public aia b()
    {
        return d;
    }

    public void b(Bundle bundle)
    {
        bundle.putString("conversation_state_model_conversation_name", e());
        ArrayList arraylist = new ArrayList(i.size());
        for (Iterator iterator = i.iterator(); iterator.hasNext(); arraylist.add((Parcelable)(ato)iterator.next())) { }
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

    public anr f()
    {
        return h;
    }

    public jsh g()
    {
        return jsh.a(i);
    }

    public void h()
    {
        i = new ArrayList();
        b.a(null);
        i();
    }
}
