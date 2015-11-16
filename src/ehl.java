// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.Locale;

public final class ehl extends egn
{

    private SpannableStringBuilder b;
    private aoa c;
    private amx d;
    private int e;
    private AvatarView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private boolean k;
    private eia l;
    private ejk m;

    public ehl(Context context, aoa aoa1)
    {
        this(context, aoa1, null, true);
    }

    public ehl(Context context, aoa aoa1, aii aii)
    {
        this(context, aoa1, aii, false);
    }

    private ehl(Context context, aoa aoa1, aii aii, boolean flag)
    {
        super(context);
        b = new SpannableStringBuilder();
        c = aoa1;
        if (aii != null)
        {
            new ehp(this, aii);
        }
        Object obj = LayoutInflater.from(context).inflate(g.gL, this);
        f = (AvatarView)((View) (obj)).findViewById(h.D);
        f.e();
        g = (ImageView)((View) (obj)).findViewById(h.aa);
        h = (TextView)((View) (obj)).findViewById(h.dH);
        i = (TextView)((View) (obj)).findViewById(h.aK);
        j = (ImageView)((View) (obj)).findViewById(h.cw);
        dvq dvq1 = (dvq)hlp.b(context, dvq);
        if (dvq1 == null)
        {
            m = new ejk(i);
        } else
        {
            hof hof1 = (hof)hlp.b(getContext()).a(hnn);
            if (flag)
            {
                aii = this;
            } else
            {
                aii = null;
            }
            m = dvq1.a(hof1, aoa1.h(), i, aii);
        }
        aii = (ViewGroup)((View) (obj)).findViewById(h.db);
        obj = (ejx)hlp.b(context, ejx);
        if (obj != null)
        {
            l = ((ejx) (obj)).a(aii, aoa1.h(), LayoutInflater.from(context));
            return;
        } else
        {
            aii.setVisibility(8);
            return;
        }
    }

    static amx a(ehl ehl1)
    {
        return ehl1.d;
    }

    public amx a()
    {
        return d;
    }

    public void a(amx amx1, String s, boolean flag, int i1)
    {
        String s3;
        d = amx1;
        e = i1;
        s3 = amx1.e();
        k = flag;
        if (!amx1.n()) goto _L2; else goto _L1
_L1:
        j.setVisibility(0);
        m.a(amx1.e(), amx1.i());
        if (l != null)
        {
            l.a(amx1.i());
        }
_L5:
        f.a(amx1.f(), s3, c);
        if (flag)
        {
            g.setImageResource(com.google.android.apps.hangouts.R.drawable.ce);
            g.setContentDescription(getResources().getText(l.ak));
        }
        amx1 = s;
        if (s != null)
        {
            amx1 = s.toUpperCase(Locale.getDefault());
        }
        a(h, s3, b, ((String) (amx1)));
        return;
_L2:
        if (!amx1.q()) goto _L4; else goto _L3
_L3:
        String s1 = amx1.a().c();
_L6:
        if (s1 != null && !s1.equals(s3))
        {
            i.setText(s1);
        } else
        {
            i.setVisibility(8);
        }
        if (true) goto _L5; else goto _L4
_L4:
        String s2 = amx1.c();
        s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = null;
        }
          goto _L6
    }

    public void a(eho eho)
    {
        ehm ehm1 = null;
        if (eho != null)
        {
            ehm1 = new ehm(this, eho);
            eho = new ehn(this, eho);
        } else
        {
            Object obj = null;
            eho = ehm1;
            ehm1 = obj;
        }
        f.setOnClickListener(ehm1);
        setOnLongClickListener(eho);
    }

    protected void a(boolean flag)
    {
        View view = findViewById(h.aa);
        if (view instanceof Checkable)
        {
            ((Checkable)view).setChecked(isChecked());
        }
        a(view, flag);
    }

    public void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
        if (!k)
        {
            ImageView imageview = g;
            Object obj;
            if (flag)
            {
                obj = getContext().getResources().getText(l.aj);
            } else
            {
                obj = "";
            }
            imageview.setContentDescription(((CharSequence) (obj)));
        }
    }

    public int b()
    {
        return e;
    }

    public void k()
    {
        super.k();
        h.setText(null);
        m.a();
        g.setImageResource(com.google.android.apps.hangouts.R.drawable.bU);
        if (l != null)
        {
            l.a(null);
        }
        j.setVisibility(8);
        i.setVisibility(0);
    }
}
