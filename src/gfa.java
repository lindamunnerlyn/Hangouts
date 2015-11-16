// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.VideoViewRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class gfa
    implements Runnable
{

    final gez a;

    gfa(gez gez1)
    {
        a = gez1;
        super();
    }

    public void run()
    {
        Object obj = a;
        g.w();
        if (((gez) (obj)).d)
        {
            gkc.a("vclib", "Refreshing video streams");
            ArrayList arraylist = new ArrayList(((gez) (obj)).a.size());
            Iterator iterator = ((gez) (obj)).a.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                VideoViewRequest videoviewrequest = ((gev)iterator.next()).a(((gez) (obj)).c);
                if (videoviewrequest != null)
                {
                    arraylist.add(videoviewrequest);
                }
            } while (true);
            if (arraylist.size() > 0)
            {
                VideoViewRequest avideoviewrequest[] = new VideoViewRequest[arraylist.size()];
                arraylist.toArray(avideoviewrequest);
                ((gez) (obj)).b.a(avideoviewrequest);
                for (obj = ((gez) (obj)).a.values().iterator(); ((Iterator) (obj)).hasNext(); ((gev)((Iterator) (obj)).next()).b()) { }
            }
        }
    }
}
