// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;
import com.google.android.apps.hangouts.views.AvatarView;

public final class dwe
{

    final Context a;
    final StatusMessageSettingsFragment b;
    final aoa c;
    final csy d;
    EditText e;
    TextView f;
    View g;
    Button h;
    private AccessibilityManager i;
    private final TextWatcher j = new dwh(this);

    dwe(Context context, iql iql1, StatusMessageSettingsFragment statusmessagesettingsfragment, csy csy)
    {
        a = context;
        b = statusmessagesettingsfragment;
        c = dcn.e(iql1.a());
        d = csy;
    }

    static int a(String s)
    {
        return s.codePointCount(0, s.length());
    }

    static void a(dwe dwe1)
    {
        ((InputMethodManager)dwe1.a.getSystemService("input_method")).hideSoftInputFromWindow(dwe1.e.getWindowToken(), 0);
        dwe1.b.getActivity().finish();
    }

    static boolean b(dwe dwe1)
    {
        return dwe1.i != null && dwe1.i.isEnabled() && dwe1.i.isTouchExplorationEnabled();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(g.gW, viewgroup, false);
        e = (EditText)viewgroup.findViewById(h.fN);
        f = (TextView)viewgroup.findViewById(h.fL);
        g = viewgroup.findViewById(h.fM);
        h = (Button)viewgroup.findViewById(h.fP);
        Button button = (Button)viewgroup.findViewById(h.fO);
        ((AvatarView)viewgroup.findViewById(h.ds)).a(c.v(), c.c(), c);
        e.addTextChangedListener(j);
        if (eco.d(a))
        {
            b.getActivity().getWindow().setSoftInputMode(2);
        }
        if (bundle != null)
        {
            layoutinflater = bundle.getString("saved_text");
        } else
        {
            layoutinflater = b.getActivity().getIntent().getStringExtra("status_message");
        }
        if (layoutinflater != null)
        {
            layoutinflater = eep.a(Html.fromHtml(layoutinflater));
        } else
        {
            layoutinflater = new SpannableString("");
        }
        eha.a(a).a(layoutinflater, e);
        e.setText(layoutinflater);
        e.setSelection(layoutinflater.length());
        i = (AccessibilityManager)a.getSystemService("accessibility");
        layoutinflater = a.getResources();
        ((TextView)viewgroup.findViewById(h.dt)).setText(layoutinflater.getString(l.fG, new Object[] {
            "\uD83D\uDE4B"
        }));
        h.setOnClickListener(new dwf(this));
        button.setOnClickListener(new dwg(this));
        return viewgroup;
    }

    public void a(Bundle bundle)
    {
        bundle.putString("saved_text", e.getText().toString());
    }
}
