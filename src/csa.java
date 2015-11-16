// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import java.util.List;

final class csa
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final List a;
    final EditText b;
    final crw c;

    csa(crw crw1, List list, EditText edittext)
    {
        c = crw1;
        a = list;
        b = edittext;
        super();
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = crw.c(c).b;
        crw.a(c, (doi)a.get(i));
        view = crw.c(c).b;
        if (!TextUtils.equals(adapterview, view))
        {
            crw.d(c).a(view);
        }
        view = b;
        adapterview = String.valueOf(crw.c(c).c);
        if (adapterview.length() != 0)
        {
            adapterview = "+".concat(adapterview);
        } else
        {
            adapterview = new String("+");
        }
        view.setText(adapterview);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        crw.a(c, (doi)a.get(0));
        EditText edittext = b;
        adapterview = String.valueOf(crw.c(c).c);
        if (adapterview.length() != 0)
        {
            adapterview = "+".concat(adapterview);
        } else
        {
            adapterview = new String("+");
        }
        edittext.setText(adapterview);
    }
}
