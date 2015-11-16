// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class cix extends Preference
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static String a = null;
    private static CompoundButton b = null;
    private boolean c;
    private boolean d;

    private cix(Context context)
    {
        this(context, null, g.cW);
    }

    public cix(Context context, byte byte0)
    {
        this(context);
    }

    private cix(Context context, AttributeSet attributeset, int i)
    {
        super(context, null, i);
        c = false;
        d = true;
    }

    private static void a(CompoundButton compoundbutton)
    {
        compoundbutton.setContentDescription(((TextView)((View)compoundbutton.getParent()).findViewById(0x1020016)).getText().toString());
    }

    public void a()
    {
        a = getKey();
    }

    public View getView(View view, ViewGroup viewgroup)
    {
        view = super.getView(view, viewgroup);
        viewgroup = view.findViewById(h.u);
        if (viewgroup != null && (viewgroup instanceof RadioButton))
        {
            viewgroup = (RadioButton)viewgroup;
            if (d)
            {
                viewgroup.setOnCheckedChangeListener(this);
                boolean flag = getKey().equals(a);
                if (flag)
                {
                    b = viewgroup;
                    a = getKey();
                }
                c = true;
                viewgroup.setChecked(flag);
                c = false;
            } else
            {
                viewgroup.setVisibility(8);
            }
            a(viewgroup);
        }
        viewgroup = view.findViewById(h.gu);
        if (viewgroup != null && (viewgroup instanceof RelativeLayout))
        {
            viewgroup.setOnClickListener(this);
        }
        return view;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        String s = String.valueOf(getKey());
        (new StringBuilder(String.valueOf(s).length() + 11)).append("ID: ").append(s).append(" :").append(flag);
        if (c)
        {
            return;
        }
        if (flag)
        {
            if (b != null)
            {
                b.setChecked(false);
            }
            b = compoundbutton;
            a = getKey();
            callChangeListener(a);
        } else
        {
            b = null;
            a = null;
        }
        a(compoundbutton);
    }

    public void onClick(View view)
    {
        if (view != null && h.gu == view.getId())
        {
            view = getContext();
            if (view != null)
            {
                view.startActivity(g.p(getKey()));
            }
        }
    }

    public void setSelectable(boolean flag)
    {
        d = flag;
    }

}
