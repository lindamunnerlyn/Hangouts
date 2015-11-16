// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.ContactDetailItemView;
import java.util.Locale;

public final class egm extends egn
{

    private static final boolean b = false;
    private final LinearLayout c;
    private final int d;
    private final TextView e;
    private final AvatarView f;
    private final View g;
    private final ContactDetailItemView h;
    private final TextView i;
    private final TextView j;
    private final aoa k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private int q;
    private int r;
    private int s;
    private bhv t;
    private bhn u;
    private String v;
    private final SpannableStringBuilder w;

    public egm(Context context, aoa aoa)
    {
        this(context, aoa, (byte)0);
    }

    private egm(Context context, aoa aoa, byte byte0)
    {
        super(context, null);
        w = new SpannableStringBuilder();
        k = aoa;
        context = LayoutInflater.from(context).inflate(g.fi, this);
        c = (LinearLayout)context.findViewById(h.dn);
        d = c.getPaddingTop();
        e = (TextView)context.findViewById(h.dH);
        f = (AvatarView)context.findViewById(h.D);
        g = context.findViewById(h.J);
        h = (ContactDetailItemView)context.findViewById(h.ah);
        i = (TextView)context.findViewById(h.gg);
        j = (TextView)context.findViewById(h.eA);
    }

    private boolean a(int i1)
    {
        return (s & i1) != 0;
    }

    public bhv a()
    {
        return t;
    }

    public void a(String s1)
    {
        if (s1 == null)
        {
            v = null;
            return;
        } else
        {
            v = s1.toUpperCase(Locale.getDefault());
            return;
        }
    }

    public void a(String s1, String s2, String s3, String s4, int i1, int j1, bhv bhv1, 
            bhn bhn1, int k1)
    {
        l = s1;
        m = s2;
        n = s3;
        o = s4;
        t = bhv1;
        q = i1;
        r = j1;
        p = null;
        u = bhn1;
        s = k1;
        if (b)
        {
            s1 = String.valueOf(m);
            if (s1.length() != 0)
            {
                s1 = "Redrawing call contact item: mName=".concat(s1);
            } else
            {
                s1 = new String("Redrawing call contact item: mName=");
            }
            eev.b("Babel", s1);
        }
        if (a(2))
        {
            e.setVisibility(0);
            a(e, m, w, v);
        } else
        {
            e.setVisibility(8);
        }
        if (a(1))
        {
            c.setPadding(c.getPaddingLeft(), d, c.getPaddingRight(), c.getPaddingBottom());
            f.setVisibility(0);
            f.a(o, m, k);
            s1 = f;
            if (q == 1)
            {
                i1 = 3;
            } else
            {
                i1 = 2;
            }
            s1.a(i1);
            g.setVisibility(8);
        } else
        {
            c.setPadding(c.getPaddingLeft(), 0, c.getPaddingRight(), c.getPaddingBottom());
            g.setVisibility(0);
            f.setVisibility(8);
            f.a(null, null, null);
        }
        s2 = null;
        if (q == 1 && !TextUtils.isEmpty(p))
        {
            s1 = new bhw(p);
        } else
        {
            s1 = s2;
            if (t != null)
            {
                s1 = t.e();
                if (s1 != null)
                {
                    if (!i())
                    {
                        s3 = eey.a(eey.g(((bia) (s1)).a));
                        s1 = s2;
                        if (s3 != null)
                        {
                            s1 = new bhw((new Locale(Locale.getDefault().getLanguage(), s3)).getDisplayCountry());
                        }
                    }
                } else
                {
                    s1 = m;
                    eev.g("Babel", (new StringBuilder(String.valueOf(s1).length() + 45)).append("Call contact item ").append(s1).append(" doesn't have phone number!").toString());
                    s1 = s2;
                }
            }
        }
        h.setText("");
        if (s1 != null)
        {
            h.a(s1, v);
        }
        j.setText("");
        j.setContentDescription(null);
        if (u == null || !a(8))
        {
            break MISSING_BLOCK_LABEL_814;
        }
        i1 = com.google.android.apps.hangouts.R.drawable.aK;
        s1 = g.a(u.c(), System.currentTimeMillis(), false).toString();
        u.d();
        JVM INSTR tableswitch 0 2: default 372
    //                   0 715
    //                   1 748
    //                   2 781;
           goto _L1 _L2 _L3 _L4
_L1:
        eev.g("Babel", "unsupported call type!");
_L5:
        i.setVisibility(0);
        i.setText(s1);
        i.setCompoundDrawablesWithIntrinsicBounds(i1, 0, 0, 0);
        if (!u.f() && !TextUtils.isEmpty(u.e()))
        {
            j.setText(getResources().getString(l.bq, new Object[] {
                u.e()
            }));
            j.setContentDescription(getResources().getString(l.br, new Object[] {
                u.e()
            }));
        }
_L6:
        invalidate();
        return;
_L2:
        i1 = com.google.android.apps.hangouts.R.drawable.aK;
        i.setContentDescription(getResources().getString(l.bh, new Object[] {
            s1
        }));
          goto _L5
_L3:
        i1 = com.google.android.apps.hangouts.R.drawable.aM;
        i.setContentDescription(getResources().getString(l.bj, new Object[] {
            s1
        }));
          goto _L5
_L4:
        i1 = com.google.android.apps.hangouts.R.drawable.aL;
        i.setContentDescription(getResources().getString(l.bi, new Object[] {
            s1
        }));
          goto _L5
        i.setVisibility(8);
        i.setText("");
        i.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
          goto _L6
    }

    public bhn b()
    {
        return u;
    }

    public String c()
    {
        return l;
    }

    public String d()
    {
        if (u != null)
        {
            return u.a();
        } else
        {
            return null;
        }
    }

    public String e()
    {
        if (i())
        {
            return m;
        } else
        {
            return null;
        }
    }

    public String f()
    {
        return n;
    }

    public String g()
    {
        return o;
    }

    public int h()
    {
        return q;
    }

    public boolean i()
    {
        return r != 2 && !a(16);
    }

    static 
    {
        hnc hnc = eev.w;
    }
}
