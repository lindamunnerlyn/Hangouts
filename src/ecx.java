// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.AudioAttachmentView;

public final class ecx
    implements android.view.View.OnClickListener
{

    final AudioAttachmentView a;

    public ecx(AudioAttachmentView audioattachmentview)
    {
        a = audioattachmentview;
        super();
    }

    public void onClick(View view)
    {
        if (AudioAttachmentView.d(a) != null)
        {
            int i = AudioAttachmentView.d(a).b();
            if (i == 0 || i == 1)
            {
                ebw.f("Babel", "speakerphoneButton.onClick: button should be hidden, but isn't.");
                return;
            } else
            {
                AudioAttachmentView.d(a).d();
                AudioAttachmentView.a(a);
                return;
            }
        } else
        {
            ebw.f("Babel", "speakerphoneButton.onClick: audioPlaybackController is null");
            return;
        }
    }
}
