// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kog;
import koh;
import koj;
import kon;
import kop;

public final class clear extends koj
{

    private static volatile shortDisplayName _emptyArray[];
    public InviteeId inviteeId;
    public String profileId;
    public String profileName;
    public String shortDisplayName;

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

    public shortDisplayName mergeFrom(kog kog1)
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

    public InviteeId()
    {
        clear();
    }
}
