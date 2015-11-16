// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.SmsMessage;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.conversation.v2.MessageEditText;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class aut extends FrameLayout
    implements android.widget.AdapterView.OnItemSelectedListener, android.widget.TextView.OnEditorActionListener
{

    private static final InputFilter l[] = new InputFilter[0];
    private final TransportSpinner a;
    private int b;
    private final MessageEditText c;
    private ava d;
    private int e;
    private long f;
    private ani g;
    private final View h;
    private dsm i;
    private android.view.View.OnLongClickListener j;
    private InputFilter k[];
    private boolean m;
    private arl n;
    private alw o;
    private ark p;
    private final Runnable q = new auu(this);
    private final avb r = new avb(this);

    public aut(Context context, LayoutInflater layoutinflater)
    {
        super(context);
        g = null;
        m = false;
        hgx hgx1 = hgx.b(context);
        o = (alw)hgx1.a(alw);
        layoutinflater = layoutinflater.inflate(g.fm, this, true);
        e = 3;
        h = layoutinflater.findViewById(h.dN);
        c = (MessageEditText)layoutinflater.findViewById(h.dP);
        c.addTextChangedListener(new auv(this, context));
        c.setOnEditorActionListener(this);
        c.setOnFocusChangeListener(new auw(this));
        c.a(new aux(this));
        a = (TransportSpinner)layoutinflater.findViewById(h.gI);
        a.a(hgx1);
        a();
        k();
        n = (arl)hgx.a(context, arl);
        n.a(new auy(this));
    }

    static void a(aut aut1)
    {
        int i1;
        long l1;
        l1 = SystemClock.elapsedRealtime();
        i1 = aut1.c.getText().toString().trim().length();
        aut1.e;
        JVM INSTR tableswitch 1 3: default 52
    //                   1 136
    //                   2 108
    //                   3 88;
           goto _L1 _L2 _L3 _L4
_L1:
        if (aut1.e == 1)
        {
            Runnable runnable = aut1.q;
            g.y().removeCallbacks(runnable);
            g.a(aut1.q, 5000L);
            aut1.f = l1;
        }
        return;
_L4:
        if (i1 > 0)
        {
            aut1.e = 1;
            aut1.c(aut1.e);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 == 0)
        {
            aut1.e = 3;
        } else
        {
            aut1.e = 1;
            aut1.c(aut1.e);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 == 0)
        {
            aut1.e = 3;
            aut1.c(aut1.e);
        } else
        if (l1 - aut1.f > 5000L)
        {
            aut1.e = 2;
            aut1.c(aut1.e);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void a(aut aut1, ark ark1)
    {
        if (aut1.d != null)
        {
            aut1.p = ark1;
            boolean flag;
            boolean flag1;
            if (ark1.a != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && aoe.a(ark1.a) && g.f(ark1.b))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag || flag1)
            {
                aut1.a.setEnabled(false);
            }
            if (aut1.d != null && g.e(aut1.p.b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (aut1.j == null)
                {
                    aut1.j = new auz(aut1);
                }
                if (aut1.k == null)
                {
                    aut1.k = (new InputFilter[] {
                        new android.text.InputFilter.LengthFilter(dqv.a().n())
                    });
                }
                aut1.c.setFilters(aut1.k);
            } else
            {
                aut1.c.setFilters(l);
            }
            aut1.a();
            aut1.h.requestFocus();
        }
    }

    static void a(aut aut1, CharSequence charsequence, int i1, int j1)
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        break MISSING_BLOCK_LABEL_6;
        while (true) 
        {
            do
            {
                do
                {
                    return;
                } while (aut1.n == null || aut1.p == null || aut1.d == null || !g.e(aut1.p.b));
                if (!aut1.i.d())
                {
                    break;
                }
                dsm dsm1;
                int k1;
                int l1;
                if (i1 > j1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
            } while (i1 == 0);
            charsequence = SmsMessage.calculateLength(charsequence, false);
            i1 = charsequence[0];
            k1 = charsequence[2];
            if (!dqv.a().p() && !dqv.a().q())
            {
                dsm1 = aut1.i;
                if (i1 > 1)
                {
                    flag = true;
                }
                dsm1.b(flag);
            } else
            {
                j1 = dqv.a().b();
                dsm dsm2 = aut1.i;
                boolean flag1 = flag2;
                if (j1 > 0)
                {
                    flag1 = flag2;
                    if (i1 > j1)
                    {
                        flag1 = true;
                    }
                }
                dsm2.b(flag1);
            }
            j1 = dqv.a().c();
            if (j1 > 0)
            {
                l1 = charsequence[1];
                i1 = j1;
                if (l1 + k1 < 140)
                {
                    i1 = j1 / 2;
                }
                if (l1 > i1)
                {
                    aut1.i.b(true);
                    return;
                }
            }
        }
    }

    static MessageEditText b(aut aut1)
    {
        return aut1.c;
    }

    static avb c(aut aut1)
    {
        return aut1.r;
    }

    private void c(int i1)
    {
        if (d != null)
        {
            d.a(i1);
        }
    }

    static ava d(aut aut1)
    {
        return aut1.d;
    }

    private void k()
    {
        int j1 = 0;
        int i1;
        int k1;
        boolean flag;
        if (a.getVisibility() != 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = j1;
        } else
        {
            i1 = getResources().getDimensionPixelSize(g.dY);
        }
        j1 = getResources().getDimensionPixelSize(g.dY);
        flag = ebr.d();
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = i1;
        }
        if (!flag)
        {
            i1 = j1;
        }
        h.setPadding(k1, h.getPaddingTop(), i1, h.getPaddingBottom());
    }

    private void l()
    {
        if (d != null)
        {
            d.c();
        }
    }

    private void m()
    {
        gbh.b(d);
        String s = c.getText().toString().trim();
        if (!TextUtils.isEmpty(s) || d.b())
        {
            d.a(s);
        }
        c.setText("");
    }

    private void n()
    {
        if (n == null || p == null)
        {
            return;
        }
        boolean flag = g.e(p.b);
        int i1 = n.a();
        Object obj;
        Object obj1;
        if (m)
        {
            i1 = l.jl;
            obj = null;
        } else
        if (flag)
        {
            if (i1 == 1)
            {
                obj = n.b();
                if (bhj.c(((String) (obj))))
                {
                    if (i.d())
                    {
                        i1 = g.kN;
                    } else
                    {
                        i1 = g.kO;
                    }
                    obj = null;
                } else
                {
                    gf gf1;
                    if (i.d())
                    {
                        i1 = l.jj;
                    } else
                    {
                        i1 = l.jk;
                    }
                    gf1 = gf.a();
                    obj = getContext().getString(i1, new Object[] {
                        gf1.a(ebz.p(((String) (obj))), gq.a)
                    });
                }
            } else
            {
                i1 = g.kP;
                obj = null;
            }
        } else
        {
            i1 = g.kP;
            obj = null;
        }
        obj1 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj1 = getContext().getString(i1);
        }
        c.setHint(((CharSequence) (obj1)));
    }

    public void a()
    {
        if (p != null && g.e(p.b))
        {
            a.a(i.d());
        }
        l();
        n();
    }

    public void a(int i1)
    {
        if (b == i1)
        {
            return;
        } else
        {
            b = i1;
            n();
            return;
        }
    }

    public void a(ani ani)
    {
        g = ani;
    }

    public void a(ava ava1)
    {
        d = ava1;
    }

    public void a(dsm dsm1)
    {
        i = dsm1;
    }

    public void a(CharSequence charsequence)
    {
        int i1 = c.getSelectionStart();
        int j1 = c.getSelectionEnd();
        c.getText().replace(Math.min(i1, j1), Math.max(i1, j1), charsequence);
    }

    public void a(String s, boolean flag)
    {
        if (TextUtils.isEmpty(c.getText()))
        {
            c.setText(s);
        }
        if (flag)
        {
            c.selectAll();
        }
        a();
    }

    public void a(boolean flag)
    {
        c.setFocusable(flag);
        c.setFocusableInTouchMode(flag);
        MessageEditText messageedittext = c;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        messageedittext.setImeOptions(byte0);
    }

    public void b()
    {
        c.requestFocus();
    }

    public void b(int i1)
    {
        if (i != null && d != null)
        {
            dsm dsm1 = i;
            boolean flag;
            if (i1 != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dsm1.a(flag, g.d(p.b));
            l();
        }
    }

    public boolean c()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getVisibility() == 0)
        {
            flag = flag1;
            if (c.hasFocus())
            {
                MessageEditText messageedittext = c;
                if (messageedittext != null)
                {
                    InputMethodManager inputmethodmanager = h.a(messageedittext.getContext());
                    if (inputmethodmanager != null)
                    {
                        inputmethodmanager.showSoftInput(messageedittext, 0);
                    }
                }
                flag = true;
            }
        }
        return flag;
    }

    public void d()
    {
        d = null;
        Object obj = q;
        g.y().removeCallbacks(((Runnable) (obj)));
        obj = r;
        g.y().removeCallbacks(((Runnable) (obj)));
    }

    public String e()
    {
        return c.getText().toString();
    }

    public void f()
    {
        c.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void g()
    {
        c.dispatchKeyEvent(new KeyEvent(0, 62));
    }

    public void h()
    {
        m = true;
    }

    public boolean i()
    {
        return c.getText().toString().trim().length() != 0;
    }

    public void j()
    {
        m();
    }

    public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        if ((i1 == 4 || keyevent != null && keyevent.getAction() == 0) && c.getText().length() > 0)
        {
            m();
        }
        return true;
    }

    public void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
    {
        if (d != null)
        {
            adapterview = ((AdapterView) (adapterview.getItemAtPosition(i1)));
            if (adapterview instanceof ark)
            {
                adapterview = (ark)adapterview;
                if (((ark) (adapterview)).h != null || ((ark) (adapterview)).e != null)
                {
                    n.a(adapterview);
                }
            }
        }
        k();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public void setVisibility(int i1)
    {
        super.setVisibility(i1);
        c.setVisibility(i1);
    }

}
