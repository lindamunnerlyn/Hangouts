// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class iso
    implements irl
{

    private static final Pattern a = Pattern.compile("(ChromiumNet)|(SharedPreferencesImpl-load)|(Bound thread pool)|(RenderThread)|(SamplingProfiler)|(SamplingProfilerIntegration)|(hwuiTask[0-9])|(Lightweight Thread #[\\d]*)|(Background Thread #[\\d]*)|(Blocking Thread #[\\d]*)|(java.lang.ProcessManager)|(Espresso Key Event #[\\d]*)|(G3Instrumentation)|(cr.CleanupReference)|(CleanupReference)|(SettinsObserver)|(SettingsObserver)|(JavaBridge)|NotificationManagerCompat|PPTask|(PanoramaClient)|(GLThread [\\d]*)|(TileDecoder)|(BackgroundTask #[\\d])|(FrameSequence decoding thread)|(Login Manager Threadpool)|(GifDecoder)|(AsyncTask #[\\d]*)|(Resource Decoder Thread #[\\d])|(ImageLoader)|(PowerManagerThread)|(NetworkQueueProcessor)|(source-thread-[\\d])|(disk-cache-thread-[\\d])|(IntentService.Gns:IntentService.)|(IntentService.GcmReceiveMessageService.)|(ANDROID_TEST_UTIL_THREAD)|(OkHttp ConnectionPool)|(MockHttpUrlRequestFactory)|(MockHttpURLConnection)|(Mock UrlConnection #.*)");
    private static final Pattern b = Pattern.compile("pool-[0-9]+-thread-1");
    private final ScheduledExecutorService c;
    private final Set d;
    private ScheduledFuture e;

    iso(ScheduledExecutorService scheduledexecutorservice, Set set)
    {
        c = scheduledexecutorservice;
        d = set;
    }

    static ScheduledFuture a(iso iso1)
    {
        return iso1.e;
    }

    static boolean a(Set set)
    {
        boolean flag1;
label0:
        {
            boolean flag2 = true;
            set = set.iterator();
            for (boolean flag = false; set.hasNext(); flag = true)
            {
                String s = ((Thread)set.next()).getName();
                flag1 = flag2;
                if (!b.matcher(s).matches())
                {
                    break label0;
                }
                flag1 = flag2;
                if (flag)
                {
                    break label0;
                }
            }

            flag1 = false;
        }
        return flag1;
    }

    static boolean a(StackTraceElement astacktraceelement[])
    {
        return b(astacktraceelement);
    }

    static Pattern b()
    {
        return a;
    }

    private static boolean b(StackTraceElement astacktraceelement[])
    {
        if (astacktraceelement.length != 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        astacktraceelement = astacktraceelement[astacktraceelement.length - 1];
        if (!java/lang/Thread.isAssignableFrom(Class.forName(astacktraceelement.getClassName()))) goto _L1; else goto _L3
_L3:
        boolean flag = astacktraceelement.getMethodName().equals("run");
        if (flag)
        {
            return false;
        }
          goto _L1
        astacktraceelement;
        throw new RuntimeException("Class in stack trace not found", astacktraceelement);
    }

    public void a()
    {
        boolean flag = true;
        if (!d.isEmpty())
        {
            if (d.size() != 1)
            {
                flag = false;
            }
            g.d(flag);
            if (((Boolean)d.iterator().next()).booleanValue())
            {
                return;
            }
        }
        Set set = Collections.newSetFromMap(new IdentityHashMap());
        for (Iterator iterator = Thread.getAllStackTraces().keySet().iterator(); iterator.hasNext(); set.add((Thread)iterator.next())) { }
        e = c.scheduleAtFixedRate(new isp(this, set), 0L, 500L, TimeUnit.MILLISECONDS);
    }

}
