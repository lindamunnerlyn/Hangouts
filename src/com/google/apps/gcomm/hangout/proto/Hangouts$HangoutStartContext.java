// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kog;
import koh;
import koj;
import kon;
import kop;
import kou;

public final class clear extends koj
{

    private static volatile sharingId _emptyArray[];
    public String activityId;
    public String appData;
    public String appId;
    public String appIntegrationId;
    public Integer callback;
    public String circleId;
    public String contextId;
    public String conversationId;
    public Boolean create;
    public String currentOccupantAvatar[];
    public Boolean dEPRECATEDCallback;
    public String encodedCalendarId;
    public String externalEventId;
    public sharingId externalKey;
    public String externalUserId;
    public Boolean flippy;
    public String gatewayAppId;
    public String hangoutId;
    public Integer hangoutType;
    public InitialAppData initialApp[];
    public Invitation invitation;
    public String invitedOid;
    public Invitee invitee[];
    public LatencyMarks latencyMarks;
    public Integer mediaType;
    public String nick;
    public Long numCircles;
    public String participantLogId;
    public String profileId[];
    public String referringUrl;
    public String roomAppId[];
    public String sharingId;
    public Boolean shouldAutoInvite;
    public Boolean shouldAutoJoin;
    public Boolean shouldHideInviteButton;
    public Boolean shouldMuteAudio;
    public Boolean shouldMuteVideo;
    public Integer source;
    public String squareId;
    public int startOption[];
    public String tag[];
    public String topic;
    public String widgetPublisherId;
    public String xsrfToken;

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kon.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kog kog1)
    {
        return (new <init>()).mergeFrom(kog1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kop.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        hangoutId = null;
        sharingId = null;
        hangoutType = null;
        topic = null;
        referringUrl = null;
        circleId = null;
        profileId = kou.f;
        activityId = null;
        appId = null;
        appData = null;
        flippy = null;
        dEPRECATEDCallback = null;
        source = null;
        invitation = null;
        create = null;
        nick = null;
        latencyMarks = null;
        callback = null;
        externalKey = null;
        class Invitee extends koj
        {

            private static volatile Invitee _emptyArray[];
            public InviteeId inviteeId;
            public String profileId;
            public String profileName;
            public String shortDisplayName;

            public static Invitee[] emptyArray()
            {
                if (_emptyArray == null)
                {
                    synchronized (kon.a)
                    {
                        if (_emptyArray == null)
                        {
                            _emptyArray = new Invitee[0];
                        }
                    }
                }
                return _emptyArray;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public static Invitee parseFrom(kog kog1)
            {
                return (new Invitee()).mergeFrom(kog1);
            }

            public static Invitee parseFrom(byte abyte0[])
            {
                return (Invitee)kop.mergeFrom(new Invitee(), abyte0);
            }

            public Invitee clear()
            {
                profileId = null;
                profileName = null;
                inviteeId = null;
                shortDisplayName = null;
                unknownFieldData = null;
                cachedSize = -1;
                return this;
            }

            protected int computeSerializedSize()
            {
                int j = super.computeSerializedSize();
                int i = j;
                if (profileId != null)
                {
                    i = j + koh.b(1, profileId);
                }
                j = i;
                if (profileName != null)
                {
                    j = i + koh.b(2, profileName);
                }
                i = j;
                if (inviteeId != null)
                {
                    i = j + koh.d(3, inviteeId);
                }
                j = i;
                if (shortDisplayName != null)
                {
                    j = i + koh.b(4, shortDisplayName);
                }
                return j;
            }

            public Invitee mergeFrom(kog kog1)
            {
                do
                {
                    int i = kog1.a();
                    switch (i)
                    {
                    default:
                        if (super.storeUnknownField(kog1, i))
                        {
                            continue;
                        }
                        // fall through

                    case 0: // '\0'
                        return this;

                    case 10: // '\n'
                        profileId = kog1.j();
                        break;

                    case 18: // '\022'
                        profileName = kog1.j();
                        break;

                    case 26: // '\032'
                        class InviteeId extends koj
                        {

                            private static volatile InviteeId _emptyArray[];
                            public String circleId;
                            public String email;
                            public String phoneNumber;
                            public String profileId;

                            public static InviteeId[] emptyArray()
                            {
                                if (_emptyArray == null)
                                {
                                    synchronized (kon.a)
                                    {
                                        if (_emptyArray == null)
                                        {
                                            _emptyArray = new InviteeId[0];
                                        }
                                    }
                                }
                                return _emptyArray;
                                exception;
                                obj;
                                JVM INSTR monitorexit ;
                                throw exception;
                            }

                            public static InviteeId parseFrom(kog kog2)
                            {
                                return (new InviteeId()).mergeFrom(kog2);
                            }

                            public static InviteeId parseFrom(byte abyte0[])
                            {
                                return (InviteeId)kop.mergeFrom(new InviteeId(), abyte0);
                            }

                            public InviteeId clear()
                            {
                                profileId = null;
                                phoneNumber = null;
                                circleId = null;
                                email = null;
                                unknownFieldData = null;
                                cachedSize = -1;
                                return this;
                            }

                            protected int computeSerializedSize()
                            {
                                int k = super.computeSerializedSize();
                                int j = k;
                                if (profileId != null)
                                {
                                    j = k + koh.b(1, profileId);
                                }
                                k = j;
                                if (phoneNumber != null)
                                {
                                    k = j + koh.b(2, phoneNumber);
                                }
                                j = k;
                                if (circleId != null)
                                {
                                    j = k + koh.b(3, circleId);
                                }
                                k = j;
                                if (email != null)
                                {
                                    k = j + koh.b(4, email);
                                }
                                return k;
                            }

                            public InviteeId mergeFrom(kog kog2)
                            {
                                do
                                {
                                    int j = kog2.a();
                                    switch (j)
                                    {
                                    default:
                                        if (super.storeUnknownField(kog2, j))
                                        {
                                            continue;
                                        }
                                        // fall through

                                    case 0: // '\0'
                                        return this;

                                    case 10: // '\n'
                                        profileId = kog2.j();
                                        break;

                                    case 18: // '\022'
                                        phoneNumber = kog2.j();
                                        break;

                                    case 26: // '\032'
                                        circleId = kog2.j();
                                        break;

                                    case 34: // '"'
                                        email = kog2.j();
                                        break;
                                    }
                                } while (true);
                            }

                            public volatile kop mergeFrom(kog kog2)
                            {
                                return mergeFrom(kog2);
                            }

                            public void writeTo(koh koh1)
                            {
                                if (profileId != null)
                                {
                                    koh1.a(1, profileId);
                                }
                                if (phoneNumber != null)
                                {
                                    koh1.a(2, phoneNumber);
                                }
                                if (circleId != null)
                                {
                                    koh1.a(3, circleId);
                                }
                                if (email != null)
                                {
                                    koh1.a(4, email);
                                }
                                super.writeTo(koh1);
                            }

                        public InviteeId()
                        {
                            clear();
                        }
                        }

                        if (inviteeId == null)
                        {
                            inviteeId = new InviteeId();
                        }
                        kog1.a(inviteeId);
                        break;

                    case 34: // '"'
                        shortDisplayName = kog1.j();
                        break;
                    }
                } while (true);
            }

            public volatile kop mergeFrom(kog kog1)
            {
                return mergeFrom(kog1);
            }

            public void writeTo(koh koh1)
            {
                if (profileId != null)
                {
                    koh1.a(1, profileId);
                }
                if (profileName != null)
                {
                    koh1.a(2, profileName);
                }
                if (inviteeId != null)
                {
                    koh1.b(3, inviteeId);
                }
                if (shortDisplayName != null)
                {
                    koh1.a(4, shortDisplayName);
                }
                super.writeTo(koh1);
            }

            public Invitee()
            {
                clear();
            }
        }

        invitee = Invitee.emptyArray();
        shouldAutoInvite = null;
        contextId = null;
        shouldMuteVideo = null;
        externalUserId = null;
        conversationId = null;
        squareId = null;
        invitedOid = null;
        widgetPublisherId = null;
        shouldHideInviteButton = null;
        startOption = kou.a;
        currentOccupantAvatar = kou.f;
        numCircles = null;
        externalEventId = null;
        gatewayAppId = null;
        roomAppId = kou.f;
        mediaType = null;
        appIntegrationId = null;
        shouldAutoJoin = null;
        tag = kou.f;
        encodedCalendarId = null;
        xsrfToken = null;
        class InitialAppData extends koj
        {

            private static volatile InitialAppData _emptyArray[];
            public String appId;
            public String startData;
            public Integer startType;

            public static InitialAppData[] emptyArray()
            {
                if (_emptyArray == null)
                {
                    synchronized (kon.a)
                    {
                        if (_emptyArray == null)
                        {
                            _emptyArray = new InitialAppData[0];
                        }
                    }
                }
                return _emptyArray;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public static InitialAppData parseFrom(kog kog1)
            {
                return (new InitialAppData()).mergeFrom(kog1);
            }

            public static InitialAppData parseFrom(byte abyte0[])
            {
                return (InitialAppData)kop.mergeFrom(new InitialAppData(), abyte0);
            }

            public InitialAppData clear()
            {
                appId = null;
                startData = null;
                startType = null;
                unknownFieldData = null;
                cachedSize = -1;
                return this;
            }

            protected int computeSerializedSize()
            {
                int j = super.computeSerializedSize();
                int i = j;
                if (appId != null)
                {
                    i = j + koh.b(1, appId);
                }
                j = i;
                if (startData != null)
                {
                    j = i + koh.b(2, startData);
                }
                i = j;
                if (startType != null)
                {
                    i = j + koh.e(3, startType.intValue());
                }
                return i;
            }

            public InitialAppData mergeFrom(kog kog1)
            {
_L6:
                int i = kog1.a();
                i;
                JVM INSTR lookupswitch 4: default 48
            //                           0: 57
            //                           10: 59
            //                           18: 70
            //                           24: 81;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
                return this;
_L3:
                appId = kog1.j();
                  goto _L6
_L4:
                startData = kog1.j();
                  goto _L6
_L5:
                int j = kog1.f();
                switch (j)
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    startType = Integer.valueOf(j);
                    break;
                }
                if (true) goto _L6; else goto _L7
_L7:
            }

            public volatile kop mergeFrom(kog kog1)
            {
                return mergeFrom(kog1);
            }

            public void writeTo(koh koh1)
            {
                if (appId != null)
                {
                    koh1.a(1, appId);
                }
                if (startData != null)
                {
                    koh1.a(2, startData);
                }
                if (startType != null)
                {
                    koh1.a(3, startType.intValue());
                }
                super.writeTo(koh1);
            }

            public InitialAppData()
            {
                clear();
            }
        }

        initialApp = InitialAppData.emptyArray();
        participantLogId = null;
        shouldMuteAudio = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize() + koh.b(1, hangoutId) + koh.e(2, hangoutType.intValue());
        int i = j;
        if (topic != null)
        {
            i = j + koh.b(3, topic);
        }
        j = i;
        if (referringUrl != null)
        {
            j = i + koh.b(4, referringUrl);
        }
        i = j;
        if (circleId != null)
        {
            i = j + koh.b(5, circleId);
        }
        j = i;
        if (profileId != null)
        {
            j = i;
            if (profileId.length > 0)
            {
                j = 0;
                int k = 0;
                int j1;
                int j2;
                for (j1 = 0; j < profileId.length; j1 = j2)
                {
                    String s = profileId[j];
                    int j3 = k;
                    j2 = j1;
                    if (s != null)
                    {
                        j2 = j1 + 1;
                        j3 = k + koh.a(s);
                    }
                    j++;
                    k = j3;
                }

                j = i + k + j1 * 1;
            }
        }
        i = j;
        if (activityId != null)
        {
            i = j + koh.b(7, activityId);
        }
        j = i;
        if (appId != null)
        {
            j = i + koh.b(8, appId);
        }
        i = j;
        if (appData != null)
        {
            i = j + koh.b(9, appData);
        }
        j = i;
        if (flippy != null)
        {
            flippy.booleanValue();
            j = i + (koh.f(10) + 1);
        }
        i = j;
        if (dEPRECATEDCallback != null)
        {
            dEPRECATEDCallback.booleanValue();
            i = j + (koh.f(11) + 1);
        }
        j = i;
        if (source != null)
        {
            j = i + koh.e(12, source.intValue());
        }
        i = j;
        if (invitation != null)
        {
            i = j + koh.d(13, invitation);
        }
        j = i;
        if (create != null)
        {
            create.booleanValue();
            j = i + (koh.f(14) + 1);
        }
        i = j;
        if (nick != null)
        {
            i = j + koh.b(15, nick);
        }
        j = i;
        if (latencyMarks != null)
        {
            j = i + koh.d(16, latencyMarks);
        }
        int l = j;
        if (callback != null)
        {
            l = j + koh.e(17, callback.intValue());
        }
        i = l;
        if (externalKey != null)
        {
            i = l + koh.d(18, externalKey);
        }
        j = i;
        if (invitee != null)
        {
            j = i;
            if (invitee.length > 0)
            {
                for (j = 0; j < invitee.length;)
                {
                    Invitee invitee1 = invitee[j];
                    l = i;
                    if (invitee1 != null)
                    {
                        l = i + koh.d(19, invitee1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (shouldAutoInvite != null)
        {
            shouldAutoInvite.booleanValue();
            i = j + (koh.f(20) + 1);
        }
        j = i;
        if (contextId != null)
        {
            j = i + koh.b(21, contextId);
        }
        i = j;
        if (shouldMuteVideo != null)
        {
            shouldMuteVideo.booleanValue();
            i = j + (koh.f(22) + 1);
        }
        j = i;
        if (externalUserId != null)
        {
            j = i + koh.b(23, externalUserId);
        }
        i = j;
        if (conversationId != null)
        {
            i = j + koh.b(24, conversationId);
        }
        j = i;
        if (squareId != null)
        {
            j = i + koh.b(25, squareId);
        }
        i = j;
        if (invitedOid != null)
        {
            i = j + koh.b(26, invitedOid);
        }
        l = i;
        if (widgetPublisherId != null)
        {
            l = i + koh.b(27, widgetPublisherId);
        }
        j = l;
        if (shouldHideInviteButton != null)
        {
            shouldHideInviteButton.booleanValue();
            j = l + (koh.f(28) + 1);
        }
        i = j;
        if (startOption != null)
        {
            i = j;
            if (startOption.length > 0)
            {
                i = 0;
                l = 0;
                for (; i < startOption.length; i++)
                {
                    l += koh.e(startOption[i]);
                }

                i = j + l + startOption.length * 2;
            }
        }
        j = i;
        if (currentOccupantAvatar != null)
        {
            j = i;
            if (currentOccupantAvatar.length > 0)
            {
                j = 0;
                l = 0;
                int k1;
                int k2;
                for (k1 = 0; j < currentOccupantAvatar.length; k1 = k2)
                {
                    String s1 = currentOccupantAvatar[j];
                    int k3 = l;
                    k2 = k1;
                    if (s1 != null)
                    {
                        k2 = k1 + 1;
                        k3 = l + koh.a(s1);
                    }
                    j++;
                    l = k3;
                }

                j = i + l + k1 * 2;
            }
        }
        i = j;
        if (numCircles != null)
        {
            i = j + koh.e(31, numCircles.longValue());
        }
        j = i;
        if (externalEventId != null)
        {
            j = i + koh.b(32, externalEventId);
        }
        i = j;
        if (gatewayAppId != null)
        {
            i = j + koh.b(33, gatewayAppId);
        }
        j = i;
        if (roomAppId != null)
        {
            j = i;
            if (roomAppId.length > 0)
            {
                j = 0;
                l = 0;
                int l1;
                int l2;
                for (l1 = 0; j < roomAppId.length; l1 = l2)
                {
                    String s2 = roomAppId[j];
                    int l3 = l;
                    l2 = l1;
                    if (s2 != null)
                    {
                        l2 = l1 + 1;
                        l3 = l + koh.a(s2);
                    }
                    j++;
                    l = l3;
                }

                j = i + l + l1 * 2;
            }
        }
        i = j;
        if (mediaType != null)
        {
            i = j + koh.e(35, mediaType.intValue());
        }
        j = i;
        if (appIntegrationId != null)
        {
            j = i + koh.b(36, appIntegrationId);
        }
        i = j;
        if (shouldAutoJoin != null)
        {
            shouldAutoJoin.booleanValue();
            i = j + (koh.f(37) + 1);
        }
        j = i;
        if (tag != null)
        {
            j = i;
            if (tag.length > 0)
            {
                j = 0;
                l = 0;
                int i2;
                int i3;
                for (i2 = 0; j < tag.length; i2 = i3)
                {
                    String s3 = tag[j];
                    int i4 = l;
                    i3 = i2;
                    if (s3 != null)
                    {
                        i3 = i2 + 1;
                        i4 = l + koh.a(s3);
                    }
                    j++;
                    l = i4;
                }

                j = i + l + i2 * 2;
            }
        }
        l = j;
        if (encodedCalendarId != null)
        {
            l = j + koh.b(39, encodedCalendarId);
        }
        i = l;
        if (xsrfToken != null)
        {
            i = l + koh.b(40, xsrfToken);
        }
        j = i;
        if (initialApp != null)
        {
            j = i;
            if (initialApp.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= initialApp.length)
                    {
                        break;
                    }
                    InitialAppData initialappdata = initialApp[i1];
                    j = i;
                    if (initialappdata != null)
                    {
                        j = i + koh.d(41, initialappdata);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (participantLogId != null)
        {
            i = j + koh.b(42, participantLogId);
        }
        j = i;
        if (shouldMuteAudio != null)
        {
            shouldMuteAudio.booleanValue();
            j = i + (koh.f(43) + 1);
        }
        i = j;
        if (sharingId != null)
        {
            i = j + koh.b(44, sharingId);
        }
        return i;
    }

    public sharingId mergeFrom(kog kog1)
    {
_L48:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 46: default 388
    //                   0: 398
    //                   10: 400
    //                   16: 411
    //                   26: 471
    //                   34: 482
    //                   42: 493
    //                   50: 504
    //                   58: 613
    //                   66: 624
    //                   74: 635
    //                   80: 646
    //                   88: 660
    //                   96: 674
    //                   106: 1195
    //                   112: 1224
    //                   122: 1238
    //                   130: 1249
    //                   136: 1278
    //                   146: 1327
    //                   154: 1356
    //                   160: 1488
    //                   170: 1502
    //                   176: 1513
    //                   186: 1527
    //                   194: 1538
    //                   202: 1549
    //                   210: 1560
    //                   218: 1571
    //                   224: 1582
    //                   232: 1596
    //                   234: 1780
    //                   242: 1978
    //                   248: 2088
    //                   258: 2102
    //                   266: 2113
    //                   274: 2124
    //                   280: 2234
    //                   290: 2279
    //                   296: 2290
    //                   306: 2304
    //                   314: 2414
    //                   322: 2425
    //                   330: 2436
    //                   338: 2568
    //                   344: 2579
    //                   354: 2593;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L48; else goto _L2
_L2:
        return this;
_L3:
        hangoutId = kog1.j();
          goto _L48
_L4:
        i = kog1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            hangoutType = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        topic = kog1.j();
        continue; /* Loop/switch isn't completed */
_L6:
        referringUrl = kog1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        circleId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = kou.b(kog1, 50);
        String as[];
        if (profileId == null)
        {
            i = 0;
        } else
        {
            i = profileId.length;
        }
        as = new String[k1 + i];
        k1 = i;
        if (i != 0)
        {
            System.arraycopy(profileId, 0, as, 0, i);
            k1 = i;
        }
        for (; k1 < as.length - 1; k1++)
        {
            as[k1] = kog1.j();
            kog1.a();
        }

        as[k1] = kog1.j();
        profileId = as;
        continue; /* Loop/switch isn't completed */
_L9:
        activityId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        appId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L11:
        appData = kog1.j();
        continue; /* Loop/switch isn't completed */
_L12:
        flippy = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L13:
        dEPRECATEDCallback = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        i = kog1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 47: // '/'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
        case 58: // ':'
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 63: // '?'
        case 64: // '@'
        case 65: // 'A'
        case 66: // 'B'
        case 67: // 'C'
        case 68: // 'D'
        case 69: // 'E'
        case 70: // 'F'
        case 71: // 'G'
        case 72: // 'H'
        case 73: // 'I'
        case 74: // 'J'
        case 75: // 'K'
        case 76: // 'L'
        case 77: // 'M'
        case 78: // 'N'
        case 79: // 'O'
        case 80: // 'P'
        case 81: // 'Q'
        case 82: // 'R'
        case 83: // 'S'
        case 84: // 'T'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 88: // 'X'
        case 89: // 'Y'
        case 90: // 'Z'
        case 91: // '['
        case 92: // '\\'
        case 93: // ']'
        case 94: // '^'
        case 95: // '_'
        case 96: // '`'
        case 97: // 'a'
        case 98: // 'b'
        case 99: // 'c'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        case 106: // 'j'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
        case 114: // 'r'
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
        case 118: // 'v'
        case 119: // 'w'
        case 120: // 'x'
            source = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        class Invitation extends koj
        {

            private static volatile Invitation _emptyArray[];
            public Integer invitationType;
            public String inviterGaiaId;
            public String inviterPhoneNumber;
            public String inviterProfileName;
            public Boolean isGroupInvitation;
            public Boolean isInviterPstnParticipant;
            public Boolean isInviterTrusted;
            public String phoneNumber;
            public Boolean shouldAutoAccept;
            public Long timestamp;

            public static Invitation[] emptyArray()
            {
                if (_emptyArray == null)
                {
                    synchronized (kon.a)
                    {
                        if (_emptyArray == null)
                        {
                            _emptyArray = new Invitation[0];
                        }
                    }
                }
                return _emptyArray;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public static Invitation parseFrom(kog kog2)
            {
                return (new Invitation()).mergeFrom(kog2);
            }

            public static Invitation parseFrom(byte abyte0[])
            {
                return (Invitation)kop.mergeFrom(new Invitation(), abyte0);
            }

            public Invitation clear()
            {
                timestamp = null;
                inviterGaiaId = null;
                invitationType = null;
                inviterProfileName = null;
                shouldAutoAccept = null;
                phoneNumber = null;
                inviterPhoneNumber = null;
                isInviterPstnParticipant = null;
                isGroupInvitation = null;
                isInviterTrusted = null;
                unknownFieldData = null;
                cachedSize = -1;
                return this;
            }

            protected int computeSerializedSize()
            {
                int k4 = super.computeSerializedSize() + koh.e(1, timestamp.longValue()) + koh.b(2, inviterGaiaId);
                int j4 = k4;
                if (invitationType != null)
                {
                    j4 = k4 + koh.e(3, invitationType.intValue());
                }
                k4 = j4;
                if (inviterProfileName != null)
                {
                    k4 = j4 + koh.b(4, inviterProfileName);
                }
                j4 = k4;
                if (shouldAutoAccept != null)
                {
                    shouldAutoAccept.booleanValue();
                    j4 = k4 + (koh.f(5) + 1);
                }
                k4 = j4;
                if (phoneNumber != null)
                {
                    k4 = j4 + koh.b(6, phoneNumber);
                }
                j4 = k4;
                if (inviterPhoneNumber != null)
                {
                    j4 = k4 + koh.b(7, inviterPhoneNumber);
                }
                k4 = j4;
                if (isInviterPstnParticipant != null)
                {
                    isInviterPstnParticipant.booleanValue();
                    k4 = j4 + (koh.f(8) + 1);
                }
                j4 = k4;
                if (isGroupInvitation != null)
                {
                    isGroupInvitation.booleanValue();
                    j4 = k4 + (koh.f(9) + 1);
                }
                k4 = j4;
                if (isInviterTrusted != null)
                {
                    isInviterTrusted.booleanValue();
                    k4 = j4 + (koh.f(10) + 1);
                }
                return k4;
            }

            public Invitation mergeFrom(kog kog2)
            {
_L13:
                int j4 = kog2.a();
                j4;
                JVM INSTR lookupswitch 11: default 104
            //                           0: 113
            //                           8: 115
            //                           18: 129
            //                           24: 140
            //                           34: 186
            //                           40: 197
            //                           50: 211
            //                           58: 222
            //                           64: 233
            //                           72: 247
            //                           80: 261;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
                if (super.storeUnknownField(kog2, j4)) goto _L13; else goto _L2
_L2:
                return this;
_L3:
                timestamp = Long.valueOf(kog2.e());
                  goto _L13
_L4:
                inviterGaiaId = kog2.j();
                  goto _L13
_L5:
                int k4 = kog2.f();
                switch (k4)
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                    invitationType = Integer.valueOf(k4);
                    break;
                }
                continue; /* Loop/switch isn't completed */
_L6:
                inviterProfileName = kog2.j();
                continue; /* Loop/switch isn't completed */
_L7:
                shouldAutoAccept = Boolean.valueOf(kog2.i());
                continue; /* Loop/switch isn't completed */
_L8:
                phoneNumber = kog2.j();
                continue; /* Loop/switch isn't completed */
_L9:
                inviterPhoneNumber = kog2.j();
                continue; /* Loop/switch isn't completed */
_L10:
                isInviterPstnParticipant = Boolean.valueOf(kog2.i());
                continue; /* Loop/switch isn't completed */
_L11:
                isGroupInvitation = Boolean.valueOf(kog2.i());
                continue; /* Loop/switch isn't completed */
_L12:
                isInviterTrusted = Boolean.valueOf(kog2.i());
                if (true) goto _L13; else goto _L14
_L14:
            }

            public volatile kop mergeFrom(kog kog2)
            {
                return mergeFrom(kog2);
            }

            public void writeTo(koh koh1)
            {
                koh1.b(1, timestamp.longValue());
                koh1.a(2, inviterGaiaId);
                if (invitationType != null)
                {
                    koh1.a(3, invitationType.intValue());
                }
                if (inviterProfileName != null)
                {
                    koh1.a(4, inviterProfileName);
                }
                if (shouldAutoAccept != null)
                {
                    koh1.a(5, shouldAutoAccept.booleanValue());
                }
                if (phoneNumber != null)
                {
                    koh1.a(6, phoneNumber);
                }
                if (inviterPhoneNumber != null)
                {
                    koh1.a(7, inviterPhoneNumber);
                }
                if (isInviterPstnParticipant != null)
                {
                    koh1.a(8, isInviterPstnParticipant.booleanValue());
                }
                if (isGroupInvitation != null)
                {
                    koh1.a(9, isGroupInvitation.booleanValue());
                }
                if (isInviterTrusted != null)
                {
                    koh1.a(10, isInviterTrusted.booleanValue());
                }
                super.writeTo(koh1);
            }

            public Invitation()
            {
                clear();
            }
        }

        if (invitation == null)
        {
            invitation = new Invitation();
        }
        kog1.a(invitation);
        continue; /* Loop/switch isn't completed */
_L16:
        create = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        nick = kog1.j();
        continue; /* Loop/switch isn't completed */
_L18:
        class LatencyMarks extends koj
        {

            private static volatile LatencyMarks _emptyArray[];
            public Long clientLaunch;
            public Long serverCreateRedirectEnd;
            public Long serverCreateRoomEnd;
            public Long serverCreateRoomStart;

            public static LatencyMarks[] emptyArray()
            {
                if (_emptyArray == null)
                {
                    synchronized (kon.a)
                    {
                        if (_emptyArray == null)
                        {
                            _emptyArray = new LatencyMarks[0];
                        }
                    }
                }
                return _emptyArray;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public static LatencyMarks parseFrom(kog kog2)
            {
                return (new LatencyMarks()).mergeFrom(kog2);
            }

            public static LatencyMarks parseFrom(byte abyte0[])
            {
                return (LatencyMarks)kop.mergeFrom(new LatencyMarks(), abyte0);
            }

            public LatencyMarks clear()
            {
                clientLaunch = null;
                serverCreateRoomStart = null;
                serverCreateRoomEnd = null;
                serverCreateRedirectEnd = null;
                unknownFieldData = null;
                cachedSize = -1;
                return this;
            }

            protected int computeSerializedSize()
            {
                int k4 = super.computeSerializedSize();
                int j4 = k4;
                if (clientLaunch != null)
                {
                    j4 = k4 + koh.e(1, clientLaunch.longValue());
                }
                k4 = j4;
                if (serverCreateRoomStart != null)
                {
                    k4 = j4 + koh.e(2, serverCreateRoomStart.longValue());
                }
                j4 = k4;
                if (serverCreateRoomEnd != null)
                {
                    j4 = k4 + koh.e(3, serverCreateRoomEnd.longValue());
                }
                k4 = j4;
                if (serverCreateRedirectEnd != null)
                {
                    k4 = j4 + koh.e(4, serverCreateRedirectEnd.longValue());
                }
                return k4;
            }

            public LatencyMarks mergeFrom(kog kog2)
            {
                do
                {
                    int j4 = kog2.a();
                    switch (j4)
                    {
                    default:
                        if (super.storeUnknownField(kog2, j4))
                        {
                            continue;
                        }
                        // fall through

                    case 0: // '\0'
                        return this;

                    case 8: // '\b'
                        clientLaunch = Long.valueOf(kog2.e());
                        break;

                    case 16: // '\020'
                        serverCreateRoomStart = Long.valueOf(kog2.e());
                        break;

                    case 24: // '\030'
                        serverCreateRoomEnd = Long.valueOf(kog2.e());
                        break;

                    case 32: // ' '
                        serverCreateRedirectEnd = Long.valueOf(kog2.e());
                        break;
                    }
                } while (true);
            }

            public volatile kop mergeFrom(kog kog2)
            {
                return mergeFrom(kog2);
            }

            public void writeTo(koh koh1)
            {
                if (clientLaunch != null)
                {
                    koh1.b(1, clientLaunch.longValue());
                }
                if (serverCreateRoomStart != null)
                {
                    koh1.b(2, serverCreateRoomStart.longValue());
                }
                if (serverCreateRoomEnd != null)
                {
                    koh1.b(3, serverCreateRoomEnd.longValue());
                }
                if (serverCreateRedirectEnd != null)
                {
                    koh1.b(4, serverCreateRedirectEnd.longValue());
                }
                super.writeTo(koh1);
            }

            public LatencyMarks()
            {
                clear();
            }
        }

        if (latencyMarks == null)
        {
            latencyMarks = new LatencyMarks();
        }
        kog1.a(latencyMarks);
        continue; /* Loop/switch isn't completed */
_L19:
        i = kog1.f();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            callback = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        if (externalKey == null)
        {
            externalKey = new nit>();
        }
        kog1.a(externalKey);
        continue; /* Loop/switch isn't completed */
_L21:
        int l1 = kou.b(kog1, 154);
        Invitee ainvitee[];
        if (invitee == null)
        {
            i = 0;
        } else
        {
            i = invitee.length;
        }
        ainvitee = new Invitee[l1 + i];
        l1 = i;
        if (i != 0)
        {
            System.arraycopy(invitee, 0, ainvitee, 0, i);
            l1 = i;
        }
        for (; l1 < ainvitee.length - 1; l1++)
        {
            ainvitee[l1] = new Invitee();
            kog1.a(ainvitee[l1]);
            kog1.a();
        }

        ainvitee[l1] = new Invitee();
        kog1.a(ainvitee[l1]);
        invitee = ainvitee;
        continue; /* Loop/switch isn't completed */
_L22:
        shouldAutoInvite = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L23:
        contextId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L24:
        shouldMuteVideo = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L25:
        externalUserId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L26:
        conversationId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L27:
        squareId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L28:
        invitedOid = kog1.j();
        continue; /* Loop/switch isn't completed */
_L29:
        widgetPublisherId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L30:
        shouldHideInviteButton = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L31:
        int ai[];
        int i2;
        int l3;
        l3 = kou.b(kog1, 232);
        ai = new int[l3];
        i2 = 0;
        i = 0;
_L54:
        if (i2 >= l3) goto _L50; else goto _L49
_L49:
        int i4;
        if (i2 != 0)
        {
            kog1.a();
        }
        i4 = kog1.f();
        i4;
        JVM INSTR tableswitch 0 1: default 1664
    //                   0 1673
    //                   1 1673;
           goto _L51 _L52 _L52
_L51:
        i2++;
        continue; /* Loop/switch isn't completed */
_L52:
        int j3 = i + 1;
        ai[i] = i4;
        i = j3;
        if (true) goto _L51; else goto _L50
_L50:
        if (i != 0)
        {
            if (startOption == null)
            {
                i2 = 0;
            } else
            {
                i2 = startOption.length;
            }
            if (i2 == 0 && i == ai.length)
            {
                startOption = ai;
            } else
            {
                int ai1[] = new int[i2 + i];
                if (i2 != 0)
                {
                    System.arraycopy(startOption, 0, ai1, 0, i2);
                }
                System.arraycopy(ai, 0, ai1, i2, i);
                startOption = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L54; else goto _L53
_L53:
_L32:
        int k3;
        k3 = kog1.c(kog1.p());
        i = kog1.r();
        i2 = 0;
_L60:
        if (kog1.q() > 0)
        {
            switch (kog1.f())
            {
            case 0: // '\0'
            case 1: // '\001'
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i2 == 0) goto _L56; else goto _L55
_L55:
        kog1.e(i);
        if (startOption == null)
        {
            i = 0;
        } else
        {
            i = startOption.length;
        }
        ai = new int[i2 + i];
        i2 = i;
        if (i != 0)
        {
            System.arraycopy(startOption, 0, ai, 0, i);
            i2 = i;
        }
_L58:
        if (kog1.q() > 0)
        {
            i = kog1.f();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[i2] = i;
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        startOption = ai;
_L56:
        kog1.d(k3);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L58; else goto _L57
_L57:
        if (true) goto _L60; else goto _L59
_L59:
_L33:
        int j2 = kou.b(kog1, 242);
        String as1[];
        int j;
        if (currentOccupantAvatar == null)
        {
            j = 0;
        } else
        {
            j = currentOccupantAvatar.length;
        }
        as1 = new String[j2 + j];
        j2 = j;
        if (j != 0)
        {
            System.arraycopy(currentOccupantAvatar, 0, as1, 0, j);
            j2 = j;
        }
        for (; j2 < as1.length - 1; j2++)
        {
            as1[j2] = kog1.j();
            kog1.a();
        }

        as1[j2] = kog1.j();
        currentOccupantAvatar = as1;
        continue; /* Loop/switch isn't completed */
_L34:
        numCircles = Long.valueOf(kog1.e());
        continue; /* Loop/switch isn't completed */
_L35:
        externalEventId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L36:
        gatewayAppId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L37:
        int k2 = kou.b(kog1, 274);
        String as2[];
        int k;
        if (roomAppId == null)
        {
            k = 0;
        } else
        {
            k = roomAppId.length;
        }
        as2 = new String[k2 + k];
        k2 = k;
        if (k != 0)
        {
            System.arraycopy(roomAppId, 0, as2, 0, k);
            k2 = k;
        }
        for (; k2 < as2.length - 1; k2++)
        {
            as2[k2] = kog1.j();
            kog1.a();
        }

        as2[k2] = kog1.j();
        roomAppId = as2;
        continue; /* Loop/switch isn't completed */
_L38:
        int l = kog1.f();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
            mediaType = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L39:
        appIntegrationId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L40:
        shouldAutoJoin = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L41:
        int l2 = kou.b(kog1, 306);
        String as3[];
        int i1;
        if (tag == null)
        {
            i1 = 0;
        } else
        {
            i1 = tag.length;
        }
        as3 = new String[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(tag, 0, as3, 0, i1);
            l2 = i1;
        }
        for (; l2 < as3.length - 1; l2++)
        {
            as3[l2] = kog1.j();
            kog1.a();
        }

        as3[l2] = kog1.j();
        tag = as3;
        continue; /* Loop/switch isn't completed */
_L42:
        encodedCalendarId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L43:
        xsrfToken = kog1.j();
        continue; /* Loop/switch isn't completed */
_L44:
        int i3 = kou.b(kog1, 330);
        InitialAppData ainitialappdata[];
        int j1;
        if (initialApp == null)
        {
            j1 = 0;
        } else
        {
            j1 = initialApp.length;
        }
        ainitialappdata = new InitialAppData[i3 + j1];
        i3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(initialApp, 0, ainitialappdata, 0, j1);
            i3 = j1;
        }
        for (; i3 < ainitialappdata.length - 1; i3++)
        {
            ainitialappdata[i3] = new InitialAppData();
            kog1.a(ainitialappdata[i3]);
            kog1.a();
        }

        ainitialappdata[i3] = new InitialAppData();
        kog1.a(ainitialappdata[i3]);
        initialApp = ainitialappdata;
        continue; /* Loop/switch isn't completed */
_L45:
        participantLogId = kog1.j();
        continue; /* Loop/switch isn't completed */
_L46:
        shouldMuteAudio = Boolean.valueOf(kog1.i());
        continue; /* Loop/switch isn't completed */
_L47:
        sharingId = kog1.j();
        if (true) goto _L48; else goto _L61
_L61:
    }

    public volatile kop mergeFrom(kog kog1)
    {
        return mergeFrom(kog1);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        koh1.a(1, hangoutId);
        koh1.a(2, hangoutType.intValue());
        if (topic != null)
        {
            koh1.a(3, topic);
        }
        if (referringUrl != null)
        {
            koh1.a(4, referringUrl);
        }
        if (circleId != null)
        {
            koh1.a(5, circleId);
        }
        if (profileId != null && profileId.length > 0)
        {
            for (int i = 0; i < profileId.length; i++)
            {
                String s = profileId[i];
                if (s != null)
                {
                    koh1.a(6, s);
                }
            }

        }
        if (activityId != null)
        {
            koh1.a(7, activityId);
        }
        if (appId != null)
        {
            koh1.a(8, appId);
        }
        if (appData != null)
        {
            koh1.a(9, appData);
        }
        if (flippy != null)
        {
            koh1.a(10, flippy.booleanValue());
        }
        if (dEPRECATEDCallback != null)
        {
            koh1.a(11, dEPRECATEDCallback.booleanValue());
        }
        if (source != null)
        {
            koh1.a(12, source.intValue());
        }
        if (invitation != null)
        {
            koh1.b(13, invitation);
        }
        if (create != null)
        {
            koh1.a(14, create.booleanValue());
        }
        if (nick != null)
        {
            koh1.a(15, nick);
        }
        if (latencyMarks != null)
        {
            koh1.b(16, latencyMarks);
        }
        if (callback != null)
        {
            koh1.a(17, callback.intValue());
        }
        if (externalKey != null)
        {
            koh1.b(18, externalKey);
        }
        if (invitee != null && invitee.length > 0)
        {
            for (int j = 0; j < invitee.length; j++)
            {
                Invitee invitee1 = invitee[j];
                if (invitee1 != null)
                {
                    koh1.b(19, invitee1);
                }
            }

        }
        if (shouldAutoInvite != null)
        {
            koh1.a(20, shouldAutoInvite.booleanValue());
        }
        if (contextId != null)
        {
            koh1.a(21, contextId);
        }
        if (shouldMuteVideo != null)
        {
            koh1.a(22, shouldMuteVideo.booleanValue());
        }
        if (externalUserId != null)
        {
            koh1.a(23, externalUserId);
        }
        if (conversationId != null)
        {
            koh1.a(24, conversationId);
        }
        if (squareId != null)
        {
            koh1.a(25, squareId);
        }
        if (invitedOid != null)
        {
            koh1.a(26, invitedOid);
        }
        if (widgetPublisherId != null)
        {
            koh1.a(27, widgetPublisherId);
        }
        if (shouldHideInviteButton != null)
        {
            koh1.a(28, shouldHideInviteButton.booleanValue());
        }
        if (startOption != null && startOption.length > 0)
        {
            for (int k = 0; k < startOption.length; k++)
            {
                koh1.a(29, startOption[k]);
            }

        }
        if (currentOccupantAvatar != null && currentOccupantAvatar.length > 0)
        {
            for (int l = 0; l < currentOccupantAvatar.length; l++)
            {
                String s1 = currentOccupantAvatar[l];
                if (s1 != null)
                {
                    koh1.a(30, s1);
                }
            }

        }
        if (numCircles != null)
        {
            koh1.b(31, numCircles.longValue());
        }
        if (externalEventId != null)
        {
            koh1.a(32, externalEventId);
        }
        if (gatewayAppId != null)
        {
            koh1.a(33, gatewayAppId);
        }
        if (roomAppId != null && roomAppId.length > 0)
        {
            for (int i1 = 0; i1 < roomAppId.length; i1++)
            {
                String s2 = roomAppId[i1];
                if (s2 != null)
                {
                    koh1.a(34, s2);
                }
            }

        }
        if (mediaType != null)
        {
            koh1.a(35, mediaType.intValue());
        }
        if (appIntegrationId != null)
        {
            koh1.a(36, appIntegrationId);
        }
        if (shouldAutoJoin != null)
        {
            koh1.a(37, shouldAutoJoin.booleanValue());
        }
        if (tag != null && tag.length > 0)
        {
            for (int j1 = 0; j1 < tag.length; j1++)
            {
                String s3 = tag[j1];
                if (s3 != null)
                {
                    koh1.a(38, s3);
                }
            }

        }
        if (encodedCalendarId != null)
        {
            koh1.a(39, encodedCalendarId);
        }
        if (xsrfToken != null)
        {
            koh1.a(40, xsrfToken);
        }
        if (initialApp != null && initialApp.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < initialApp.length; k1++)
            {
                InitialAppData initialappdata = initialApp[k1];
                if (initialappdata != null)
                {
                    koh1.b(41, initialappdata);
                }
            }

        }
        if (participantLogId != null)
        {
            koh1.a(42, participantLogId);
        }
        if (shouldMuteAudio != null)
        {
            koh1.a(43, shouldMuteAudio.booleanValue());
        }
        if (sharingId != null)
        {
            koh1.a(44, sharingId);
        }
        super.writeTo(koh1);
    }

    public LatencyMarks()
    {
        clear();
    }
}
