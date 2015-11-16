// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import ckj;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import cpk;
import dbf;
import gmo;

public class ArchivedConversationListActivity extends ckj
{

    public ArchivedConversationListActivity()
    {
    }

    public void a(String s, boolean flag, int i, int j)
    {
        (new cpk(this, dbf.e(m.a()), s, flag, i, j)).a(new Void[0]);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n.a(2);
    }
}
