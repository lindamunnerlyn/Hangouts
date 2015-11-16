// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cez extends cfi
{

    static final boolean b = false;
    static cfd l = new cfd();
    public String c;
    public CharSequence d;
    public String e;
    public CharSequence f;
    public Intent g;
    public String h;
    public int i;
    final List j = new ArrayList();
    final ced k;

    cez(Context context, int i1, ced ced1)
    {
        super(context, i1, ced1.a());
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0;
        k = ced1;
    }

    static CharSequence a(Context context, String s, CharSequence charsequence, String s1, int i1)
    {
        TextAppearanceSpan textappearancespan1 = new TextAppearanceSpan(context, g.ic);
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(context, g.id);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            spannablestringbuilder.append(s);
            spannablestringbuilder.setSpan(textappearancespan1, 0, s.length(), 0);
        }
        s = context.getString(l.gU);
        if (!TextUtils.isEmpty(charsequence))
        {
            if (spannablestringbuilder.length() > 0)
            {
                spannablestringbuilder.append(s);
            }
            int j1 = spannablestringbuilder.length();
            spannablestringbuilder.append(charsequence);
            spannablestringbuilder.setSpan(textappearancespan, j1, charsequence.length() + j1, 0);
        }
        if (!TextUtils.isEmpty(s1))
        {
            if (spannablestringbuilder.length() > 0)
            {
                spannablestringbuilder.append(s);
            }
            spannablestringbuilder.append(cfo.g(context, i1));
        }
        return spannablestringbuilder;
    }

    static CharSequence a(String s)
    {
        int i1 = 0;
        s = Html.fromHtml(s);
        if (s instanceof Spannable)
        {
            Spannable spannable = (Spannable)s;
            URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
            for (int j1 = aurlspan.length; i1 < j1; i1++)
            {
                spannable.removeSpan(aurlspan[i1]);
            }

        }
        return s;
    }

    static void a(Context context, int i1)
    {
        cff.b(context, i1);
        cfs.a(context, i1, null);
    }

    static void a(Context context, int i1, ced ced1, boolean flag, boolean flag1, boolean flag2)
    {
        Object obj = null;
        if (ced1.b.size() > 0)
        {
            String s;
            if ((cfg)((cef)ced1.b.get(0)).h.get(0) instanceof ceu)
            {
                obj = new cee(context, i1, ced1);
            } else
            {
                obj = new cfs(context, i1, ced1, flag1, flag2);
            }
            if (ced1.b.size() > 1)
            {
                ced1 = new cff(context, i1, ced1, ((cez) (obj)), flag1, flag2);
            } else
            {
                cff.b(context, i1);
                ced1 = ((ced) (obj));
            }
        } else
        {
            ced1 = ((ced) (obj));
            if (b)
            {
                eev.b("Babel", "No unseen notifications");
                ced1 = ((ced) (obj));
            }
        }
        if (b && ced1 != null)
        {
            obj = ((cez) (ced1)).e;
            s = String.valueOf(((cez) (ced1)).f);
            eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 17 + String.valueOf(s).length())).append("title: ").append(((String) (obj))).append(" content: ").append(s).toString());
        }
        if (ced1 == null)
        {
            a(context, i1);
            return;
        } else
        {
            cfs.a(context, i1, ((cez) (ced1)).q);
            ced1.a(flag);
            return;
        }
    }

    protected void a(boolean flag)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((cfi)iterator.next()).a(true)) { }
        Resources resources = o.getResources();
        v.a(resources.getQuantityString(g.hM, k.a, new Object[] {
            Integer.valueOf(k.a)
        }));
        if (k.a > 1)
        {
            v.b(resources.getQuantityString(g.hN, k.b.size(), new Object[] {
                Integer.valueOf(k.b.size())
            }));
        }
        super.a(flag);
    }

    protected boolean a()
    {
        cfq cfq1 = o();
        cfa.a[cfq1.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 124
    //                   2 131
    //                   3 138;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_138;
_L1:
        String s = "chat_notification_vibrate_bool_key";
_L5:
        gqz gqz1 = (gqz)hlp.a(o, gqz);
        int i1;
        if (cfq1 == cfq.a)
        {
            i1 = gqz1.b("SMS");
        } else
        {
            i1 = p;
        }
        if (i1 == -1)
        {
            s = String.valueOf(cfq1);
            eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 44)).append("Invalid account in shouldVibrate; notType = ").append(s).toString());
            return false;
        } else
        {
            return gqz1.a(i1).a(s, true);
        }
_L2:
        s = "sms_notification_vibrate_bool_key";
          goto _L5
_L3:
        s = "gv_sms_vibrate_boolean_key";
          goto _L5
        s = "gv_voicemail_vibrate_boolean_key";
          goto _L5
    }

    protected Intent b()
    {
        return (new cfb()).a(o, p, q.b());
    }

    protected boolean c()
    {
        return true;
    }

    protected int d()
    {
        return com.google.android.apps.hangouts.R.drawable.cb;
    }

    protected int e()
    {
        return 0;
    }

    protected int f()
    {
        return g.a(o, "babel_notify_chat_priority_level", 1);
    }

    protected Intent g()
    {
        return g;
    }

    protected void h()
    {
        t.a("msg");
        super.h();
    }

    protected void i()
    {
        if (cec.a(o))
        {
            g.a(dcn.e(p), 1930);
        }
    }

    protected String l()
    {
        if (k.b.size() > 0)
        {
            return ((cef)k.b.get(0)).k;
        } else
        {
            return null;
        }
    }

    protected CharSequence m()
    {
        Context context = o;
        String s;
        CharSequence charsequence;
        if (c != null)
        {
            s = c;
        } else
        {
            s = e;
        }
        if (d != null)
        {
            charsequence = d;
        } else
        {
            charsequence = f;
        }
        return cfo.a(context, s, charsequence);
    }

    protected void n()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((cfi)iterator.next()).n()) { }
        super.n();
    }

    protected cfq o()
    {
        if (k.b.size() > 0)
        {
            return ((cef)k.b.get(0)).a();
        } else
        {
            return cfq.b;
        }
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
