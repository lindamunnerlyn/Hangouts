// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.fragments.InvitationFragment;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class bkv
    implements android.view.View.OnClickListener
{

    final InvitationFragment a;

    public bkv(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void onClick(View view)
    {
        if (a.inviterCircleIds == null)
        {
            return;
        }
        g.a(InvitationFragment.j(a), 2136);
        ArrayList arraylist = new ArrayList();
        String s;
        for (view = a.inviterCircleIds.iterator(); view.hasNext(); arraylist.add(AudienceMember.a(s, (String)a.myCircles.get(s))))
        {
            s = (String)view.next();
        }

        InvitationFragment invitationfragment = a;
        emc emc1 = (new emc("com.google.android.gms.common.acl.UPDATE_CIRCLES")).a(InvitationFragment.j(a).a());
        view = String.valueOf(InvitationFragment.b(a).a);
        if (view.length() != 0)
        {
            view = "g:".concat(view);
        } else
        {
            view = new String("g:");
        }
        invitationfragment.startActivityForResult(emc1.b(view).a(arraylist).a(), 101);
    }
}
