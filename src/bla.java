// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import java.util.ArrayList;

public final class bla extends dhy
{

    final InvitationFragment a;

    public bla(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void a(aoa aoa1, cyu cyu1)
    {
        if (InvitationFragment.a(a) == null || TextUtils.equals(InvitationFragment.a(a).a, cyu1.l())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist;
        Resources resources;
        int i;
        int j;
        arraylist = cyu1.m();
        j = Math.min(arraylist.size(), InvitationFragment.b(a).size());
        resources = a.getResources();
        i = 0;
_L8:
        Object obj;
        Object obj1;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        obj1 = (cyv)arraylist.get(i);
        ((cyv) (obj1)).c;
        JVM INSTR tableswitch 1 3: default 120
    //                   1 167
    //                   2 158
    //                   3 234;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_234;
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L9:
        obj1 = (TextView)InvitationFragment.b(a).get(i);
        ((TextView) (obj1)).setVisibility(0);
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        obj = ((cyv) (obj1)).a;
          goto _L9
_L4:
        if (!TextUtils.isEmpty(((cyv) (obj1)).b))
        {
            obj = resources.getString(l.rM, new Object[] {
                ((cyv) (obj1)).b, ((cyv) (obj1)).a
            });
        } else
        {
            obj = resources.getString(l.tn, new Object[] {
                ((cyv) (obj1)).a
            });
        }
          goto _L9
        obj = ((cyv) (obj1)).a;
          goto _L9
        if (cyu1.k() == null) goto _L1; else goto _L10
_L10:
        blb blb1 = new blb(this);
        aoa1 = new aqn((new edq(cyu1.k().toString(), aoa1.a())).a(InvitationFragment.c(a).getMeasuredWidth(), (int)(a.getResources().getDisplayMetrics().density * 128F)).a(true).d(true), blb1, true, InvitationFragment.a(a));
        ((dpn)InvitationFragment.d(a).a(dpn)).a(aoa1);
        return;
    }
}
