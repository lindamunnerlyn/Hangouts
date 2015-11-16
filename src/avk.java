// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
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

public final class avk extends FrameLayout
    implements android.widget.AdapterView.OnItemSelectedListener, android.widget.TextView.OnEditorActionListener
{

    private static final InputFilter m[] = new InputFilter[0];
    final MessageEditText a;
    avr b;
    dvf c;
    asb d;
    asa e;
    final avs f = new avs(this);
    private final TransportSpinner g;
    private int h;
    private long i;
    private final View j;
    private android.view.View.OnLongClickListener k;
    private InputFilter l[];
    private boolean n;
    private final Runnable o = new avl(this);

    public avk(Context context, LayoutInflater layoutinflater, dvf dvf1)
    {
        super(context);
        n = false;
        c = dvf1;
        dvf1 = hlp.b(context);
        layoutinflater = layoutinflater.inflate(g.fk, this, true);
        h = 3;
        j = layoutinflater.findViewById(h.dC);
        a = (MessageEditText)layoutinflater.findViewById(h.dG);
        a.addTextChangedListener(new avm(this, context));
        a.setOnEditorActionListener(this);
        a.setOnFocusChangeListener(new avn(this));
        a.a(new avo(this));
        g = (TransportSpinner)layoutinflater.findViewById(h.gq);
        g.a(dvf1);
        a();
        k();
        d = (asb)hlp.a(context, asb);
        d.a(new avp(this));
    }

    private void a(int i1)
    {
        if (b != null)
        {
            b.a(i1);
        }
    }

    static void a(avk avk1)
    {
        int i1;
        long l1;
        l1 = SystemClock.elapsedRealtime();
        i1 = avk1.a.getText().toString().trim().length();
        avk1.h;
        JVM INSTR tableswitch 1 3: default 52
    //                   1 136
    //                   2 108
    //                   3 88;
           goto _L1 _L2 _L3 _L4
_L1:
        if (avk1.h == 1)
        {
            Runnable runnable = avk1.o;
            g.x().removeCallbacks(runnable);
            g.a(avk1.o, 5000L);
            avk1.i = l1;
        }
        return;
_L4:
        if (i1 > 0)
        {
            avk1.h = 1;
            avk1.a(avk1.h);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 == 0)
        {
            avk1.h = 3;
        } else
        {
            avk1.h = 1;
            avk1.a(avk1.h);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 == 0)
        {
            avk1.h = 3;
            avk1.a(avk1.h);
        } else
        if (l1 - avk1.i > 5000L)
        {
            avk1.h = 2;
            avk1.a(avk1.h);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void a(avk avk1, asa asa1)
    {
        if (avk1.b != null)
        {
            avk1.e = asa1;
            boolean flag;
            boolean flag1;
            if (asa1.a != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && aow.a(asa1.a) && g.f(asa1.b))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag || flag1)
            {
                avk1.g.setEnabled(false);
            }
            if (avk1.b != null && g.e(avk1.e.b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (avk1.k == null)
                {
                    avk1.k = new avq(avk1);
                }
                if (avk1.l == null)
                {
                    avk1.l = (new InputFilter[] {
                        new android.text.InputFilter.LengthFilter(dtp.a().n())
                    });
                }
                avk1.a.setFilters(avk1.l);
            } else
            {
                avk1.a.setFilters(m);
            }
            avk1.a();
            avk1.j.requestFocus();
        }
    }

    private void k()
    {
        int j1 = 0;
        int i1;
        int k1;
        boolean flag;
        if (g.getVisibility() != 8)
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
            i1 = getResources().getDimensionPixelSize(g.dW);
        }
        j1 = getResources().getDimensionPixelSize(g.dW);
        flag = eep.d();
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
        j.setPadding(k1, j.getPaddingTop(), i1, j.getPaddingBottom());
    }

    public void a()
    {
        if (e != null && g.e(e.b))
        {
            g.a(c.d());
        }
        if (b != null)
        {
            b.b();
        }
        if (d == null || e == null)
        {
            return;
        }
        boolean flag = g.e(e.b);
        int i1 = d.a();
        Object obj;
        Object obj1;
        if (n)
        {
            i1 = l.iD;
            obj = null;
        } else
        if (flag)
        {
            if (i1 == 1)
            {
                obj = d.b();
                if (bhv.c(((String) (obj))))
                {
                    if (c.d())
                    {
                        i1 = g.kE;
                    } else
                    {
                        i1 = g.kF;
                    }
                    obj = null;
                } else
                {
                    gf gf1;
                    if (c.d())
                    {
                        i1 = l.iB;
                    } else
                    {
                        i1 = l.iC;
                    }
                    gf1 = gf.a();
                    obj = getContext().getString(i1, new Object[] {
                        gf1.a(eey.p(((String) (obj))), gq.a)
                    });
                }
            } else
            {
                i1 = g.kG;
                obj = null;
            }
        } else
        {
            i1 = g.kG;
            obj = null;
        }
        obj1 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj1 = getContext().getString(i1);
        }
        a.setHint(((CharSequence) (obj1)));
    }

    public void a(avr avr1)
    {
        b = avr1;
    }

    public void a(CharSequence charsequence)
    {
        int i1 = a.getSelectionStart();
        int j1 = a.getSelectionEnd();
        a.getText().replace(Math.min(i1, j1), Math.max(i1, j1), charsequence);
    }

    public void a(String s, boolean flag)
    {
        if (TextUtils.isEmpty(a.getText()))
        {
            a.setText(s);
        }
        if (flag)
        {
            a.selectAll();
        }
        a();
    }

    public void a(boolean flag)
    {
        a.setFocusable(flag);
        a.setFocusableInTouchMode(flag);
        MessageEditText messageedittext = a;
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
        a.requestFocus();
    }

    public boolean c()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getVisibility() == 0)
        {
            flag = flag1;
            if (a.hasFocus())
            {
                MessageEditText messageedittext = a;
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
        b = null;
        Object obj = o;
        g.x().removeCallbacks(((Runnable) (obj)));
        obj = f;
        g.x().removeCallbacks(((Runnable) (obj)));
    }

    public String e()
    {
        return a.getText().toString();
    }

    public void f()
    {
        a.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void g()
    {
        a.dispatchKeyEvent(new KeyEvent(0, 62));
    }

    public void h()
    {
        n = true;
    }

    public boolean i()
    {
        return a.getText().toString().trim().length() != 0;
    }

    public void j()
    {
        gdv.b("Expected non-null", b);
        String s = a.getText().toString().trim();
        if (!TextUtils.isEmpty(s))
        {
            b.a(s);
        }
        a.setText("");
    }

    public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        if ((i1 == 4 || keyevent != null && keyevent.getAction() == 0) && a.getText().length() > 0)
        {
            ((baa)hlp.a(getContext(), baa)).a();
        }
        return true;
    }

    public void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
    {
        if (b != null)
        {
            adapterview = ((AdapterView) (adapterview.getItemAtPosition(i1)));
            if (adapterview instanceof asa)
            {
                adapterview = (asa)adapterview;
                if (((asa) (adapterview)).h != null || ((asa) (adapterview)).e != null)
                {
                    d.a(adapterview);
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
        a.setVisibility(i1);
    }

}
