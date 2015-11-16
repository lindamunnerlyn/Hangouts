// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class efy
    implements android.view.View.OnClickListener
{

    final AudioAttachmentView a;

    public efy(AudioAttachmentView audioattachmentview)
    {
        a = audioattachmentview;
        super();
    }

    public void onClick(View view)
    {
        if (AudioAttachmentView.d(a) != null)
        {
            switch (AudioAttachmentView.d(a).b())
            {
            default:
                return;

            case 0: // '\0'
            case 1: // '\001'
            case 5: // '\005'
                AudioAttachmentView.d(a).k();
                return;

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                AudioAttachmentView.d(a).l();
                break;
            }
            return;
        } else
        {
            eev.f("Babel", "playPauseButtonClicked: audioPlaybackController is null");
            return;
        }
    }
}
