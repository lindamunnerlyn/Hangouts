// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;
import java.lang.ref.WeakReference;
import java.util.Queue;

public final class ejg extends Handler
{

    private final WeakReference a;

    public ejg(ParticipantsGalleryView participantsgalleryview)
    {
        super(Looper.getMainLooper());
        a = new WeakReference(participantsgalleryview);
    }

    public void handleMessage(Message message)
    {
        if (message.what == 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((message = (ParticipantsGalleryView)a.get()) != null)
        {
            ParticipantsGalleryView.d(message);
            ejd ejd1 = new ejd(message, ParticipantsGalleryView.e(message).size());
            while (ParticipantsGalleryView.e(message).size() > 0) 
            {
                ParticipantsGalleryView.a(message, (ejj)ParticipantsGalleryView.e(message).poll(), ejd1);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
