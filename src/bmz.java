// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.LayoutTransition;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.dialpad.DialpadFragment;
import com.google.android.apps.hangouts.views.VoiceRatesAndBalanceView;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public class bmz extends hmm
    implements TextWatcher, android.view.View.OnClickListener, android.view.View.OnKeyListener, android.view.View.OnLongClickListener, bmt, br
{

    private static final gf a = gf.a();
    private String aj;
    private gqu ak;
    private boolean al;
    private boolean am;
    private ajj an;
    private bna b;
    private EditText c;
    private TextView d;
    private boolean e;
    private View f;
    private bms g;
    private Snackbar h;
    private VoiceRatesAndBalanceView i;

    public bmz()
    {
        aj = "";
    }

    private void e()
    {
        int j = c.length();
        if (j == c.getSelectionStart() && j == c.getSelectionEnd())
        {
            c.setCursorVisible(false);
        }
    }

    private void f()
    {
label0:
        {
            boolean flag1 = false;
            Object obj = f;
            boolean flag;
            if (!c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((View) (obj)).setEnabled(flag);
            obj = b;
            if (c())
            {
                flag = flag1;
                if ("".equals(aj))
                {
                    break label0;
                }
            }
            flag = true;
        }
        ((bna) (obj)).b(flag);
    }

    public void a()
    {
        c.getText().clear();
    }

    public void a(int j)
    {
        switch (j)
        {
        default:
            return;

        case 7: // '\007'
            j = c.getSelectionStart();
            break;
        }
        if (j > 0)
        {
            c.setSelection(j);
            c.getText().delete(j - 1, j);
        }
        a(81, true);
        a(81, false);
    }

    public void a(int j, boolean flag)
    {
        if (flag)
        {
            c.onKeyDown(j, new KeyEvent(0, j));
            if (h != null && !h.c())
            {
                h.b();
            }
        }
        e();
    }

    public void a(Cursor cursor)
    {
        if (cursor.moveToPosition(0))
        {
            aj = cursor.getString(1);
            f();
        }
    }

    public void a(bna bna1)
    {
        b = bna1;
    }

    public void a(String s)
    {
        c.setText(s);
        c.setSelection(c.getText().length());
    }

    public void afterTextChanged(Editable editable)
    {
        if (c())
        {
            c.setCursorVisible(false);
        }
        editable = c.getText().toString();
        if (i != null)
        {
            aoa aoa1 = dcn.e(ak.a());
            i.a(editable, aoa1);
        }
        if (editable.length() == 0)
        {
            b.a(editable);
        } else
        {
            b.a(a.a(editable, gq.a));
        }
        f();
    }

    public void b()
    {
        if (c())
        {
            if (!"".equals(aj))
            {
                a(aj);
                return;
            } else
            {
                eev.g("Babel_dialer", "Dialer button enabled without a last-dialed number");
                return;
            }
        } else
        {
            b.b(c.getText().toString());
            a();
            return;
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int j, int k, int i1)
    {
    }

    public boolean c()
    {
        return c.length() == 0;
    }

    public void d()
    {
        if (!am)
        {
            al = true;
            return;
        } else
        {
            al = false;
            c.setText("");
            g.c();
            i.c();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getLoaderManager().b(1, null, this);
        if (bundle != null)
        {
            bundle.u();
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        ak = (gqu)binder.a(gqu);
        an = (ajj)binder.b(ajj);
    }

    public void onClick(View view)
    {
        int j = view.getId();
        if (j == h.aH)
        {
            g.d();
            a(67, true);
        } else
        if (j == h.aS)
        {
            if (!c())
            {
                c.setCursorVisible(true);
                return;
            }
        } else
        {
            view = String.valueOf(view);
            eev.g("Babel_dialer", (new StringBuilder(String.valueOf(view).length() + 33)).append("Unexpected onClick() event from: ").append(view).toString());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g = new bms(getActivity());
        h = (Snackbar)getActivity().findViewById(h.fH);
    }

    public em onCreateLoader(int j, Bundle bundle)
    {
        if (j == 1 && ak.b())
        {
            return g.a(dcn.e(ak.a()), true, 1);
        } else
        {
            return null;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        am = true;
        bundle = layoutinflater.inflate(g.gN, viewgroup, false);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            layoutinflater = ((LinearLayout)bundle.findViewById(h.gk)).getLayoutTransition();
            layoutinflater.disableTransitionType(3);
            layoutinflater.disableTransitionType(1);
        }
        c = (EditText)bundle.findViewById(h.aS);
        c.setKeyListener(bnc.a);
        c.setOnClickListener(this);
        c.setOnKeyListener(this);
        c.setOnLongClickListener(this);
        c.addTextChangedListener(this);
        getActivity();
        layoutinflater = c;
        (new bnb(eey.j(), layoutinflater)).execute(new Void[0]);
        d = (TextView)bundle.findViewById(h.V);
        f = bundle.findViewById(h.aH);
        if (f != null)
        {
            f.setOnClickListener(this);
            f.setOnLongClickListener(this);
        }
        viewgroup = (DialpadFragment)getChildFragmentManager().a(com/google/android/apps/hangouts/fragments/dialpad/DialpadFragment.getName());
        layoutinflater = viewgroup;
        if (viewgroup == null)
        {
            layoutinflater = new DialpadFragment();
            getChildFragmentManager().a().a(h.aO, layoutinflater, com/google/android/apps/hangouts/fragments/dialpad/DialpadFragment.getName()).b();
        }
        layoutinflater.a(this);
        i = (VoiceRatesAndBalanceView)bundle.findViewById(h.eC);
        f();
        e();
        if (al)
        {
            d();
        }
        layoutinflater = dcn.e(ak.a());
        if (layoutinflater != null)
        {
            if (layoutinflater.y() && !layoutinflater.Y())
            {
                d.setText(context.getString(l.P, new Object[] {
                    eey.a(layoutinflater.A(), efb.b)
                }));
                d.setVisibility(0);
            } else
            if (an != null)
            {
                an.a(getActivity(), getLifecycle(), d);
                return bundle;
            }
        }
        return bundle;
    }

    public void onDestroy()
    {
        super.onDestroy();
        g.a();
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        if (!flag)
        {
            c.requestFocus();
        }
    }

    public boolean onKey(View view, int j, KeyEvent keyevent)
    {
        if (view.getId() == h.aS && j == 66)
        {
            b();
            return true;
        } else
        {
            return false;
        }
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a((Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
    }

    public boolean onLongClick(View view)
    {
        Editable editable = c.getText();
        int j = view.getId();
        if (j == h.aH)
        {
            editable.clear();
            f.setPressed(false);
            return true;
        }
        if (j == h.aS)
        {
            c.setCursorVisible(true);
            return false;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        aj = "";
        f();
    }

    public void onStop()
    {
        super.onStop();
        if (e)
        {
            e = false;
            a();
        }
    }

    public void onTextChanged(CharSequence charsequence, int j, int k, int i1)
    {
    }

}
