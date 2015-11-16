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

public final class bko extends dgp
{

    final InvitationFragment a;

    public bko(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void a(ani ani1, cwq cwq1)
    {
        if (InvitationFragment.b(a) == null || TextUtils.equals(InvitationFragment.b(a).a, cwq1.l())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist;
        Resources resources;
        int i;
        int j;
        arraylist = cwq1.m();
        j = Math.min(arraylist.size(), InvitationFragment.c(a).size());
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
        obj1 = (cwr)arraylist.get(i);
        ((cwr) (obj1)).c;
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
        obj1 = (TextView)InvitationFragment.c(a).get(i);
        ((TextView) (obj1)).setVisibility(0);
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        obj = ((cwr) (obj1)).a;
          goto _L9
_L4:
        if (!TextUtils.isEmpty(((cwr) (obj1)).b))
        {
            obj = resources.getString(l.st, new Object[] {
                ((cwr) (obj1)).b, ((cwr) (obj1)).a
            });
        } else
        {
            obj = resources.getString(l.tW, new Object[] {
                ((cwr) (obj1)).a
            });
        }
          goto _L9
        obj = ((cwr) (obj1)).a;
          goto _L9
        if (cwq1.k() == null) goto _L1; else goto _L10
_L10:
        bkp bkp1 = new bkp(this);
        ani1 = new apw((new eam(cwq1.k().toString(), ani1.a())).a(InvitationFragment.d(a).getMeasuredWidth(), (int)(a.getResources().getDisplayMetrics().density * 128F)).a(true).d(true), bkp1, true, InvitationFragment.b(a));
        ((dmt)InvitationFragment.e(a).a(dmt)).a(ani1);
        return;
    }
}
