// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;

public final class bio extends AsyncTask
{

    final String a;
    final ConversationListFragment b;

    public bio(ConversationListFragment conversationlistfragment, String s)
    {
        b = conversationlistfragment;
        a = s;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new ContentValues();
        ((ContentValues) (aobj)).put("self_watermark", Integer.valueOf(0));
        ((ContentValues) (aobj)).put("chat_watermark", Integer.valueOf(0));
        ((ContentValues) (aobj)).put("hangout_watermark", Integer.valueOf(0));
        ((ContentValues) (aobj)).put("has_chat_notifications", Integer.valueOf(1));
        ((ContentValues) (aobj)).put("has_video_notifications", Integer.valueOf(1));
        int i = (new aoe(ConversationListFragment.o(b), ConversationListFragment.f(b).h())).e().a("conversations", ((ContentValues) (aobj)), "conversation_id=?", new String[] {
            a
        });
        aobj = a;
        ebw.a("Babel", (new StringBuilder(String.valueOf(((Object) (aobj))).length() + 64)).append("modifying ").append(((String) (aobj))).append(" changing notification status updated ").append(i).append(" rows").toString());
        any.a(ConversationListFragment.f(b).h());
        cej.a(b.getActivity().getApplicationContext(), ConversationListFragment.f(b).h());
        return null;
    }
}
